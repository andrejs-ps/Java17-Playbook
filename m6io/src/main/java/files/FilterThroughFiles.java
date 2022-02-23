package files;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.StreamSupport;

import static java.nio.file.Files.newDirectoryStream;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;

public class FilterThroughFiles {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("iterateoverfiles");

        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
            for (Path file : ds) {
                System.out.println(file);
            }
        }

        System.out.println("Collect data: ");
        var sb = new StringBuilder();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
            for (Path file : ds) {
                if (Files.isRegularFile(file)) {
                    String content = Files.readString(file);
                    sb.append(content).append(System.lineSeparator());
                }
            }
        }
        System.out.println(sb);


        System.out.println("Filter CSVs: ");
        var sb2 = new StringBuilder();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path, "*.{csv}")) {
            for (Path file : ds) {
                if (Files.isRegularFile(file)) {
                    String content = Files.readString(file);
                    sb2.append(content).append(System.lineSeparator());
                }
            }
        }
        System.out.println(sb2);


        System.out.println("User-defined filter: ");
        DirectoryStream.Filter<Path> sizeFilter = somePath -> {
            long sizeLimit = 20; // bytes
            return Files.size(somePath) > sizeLimit;
        };

        var sb3 = new StringBuilder();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path, sizeFilter)) {
            for (Path file : ds) {
                if (Files.isRegularFile(file)) {
                    String content = Files.readString(file);
                    sb3.append(content).append(System.lineSeparator());
                }
            }
        }
        System.out.println(sb3);

        System.out.println("Complex filter - is file, under size X, file extension");
        DirectoryStream.Filter<Path> complexFilter = somePath -> {
            boolean isFile = Files.isRegularFile(somePath);
            boolean isCsv = somePath.getFileName().toString().endsWith("csv");
            boolean isUnderOneMb = Files.size(somePath) < 1024 * 1024; // 1MB

            return isFile && isCsv && isUnderOneMb;
        };


        var sb4 = new StringBuilder();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(path, complexFilter)) {
            for (Path file : ds) {
                String content = Files.readString(file);
                sb4.append(content).append(System.lineSeparator());
            }
        }
        System.out.println(sb4);

    }


    public static String collectFileData(Path dir, DirectoryStream.Filter<Path> filter) {
        var builder = new StringBuilder();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(dir, filter)) {
            for (Path file : ds) {
                String content = Files.readString(file);
                builder.append(content).append(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return builder.toString();
    }

}
