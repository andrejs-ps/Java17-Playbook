package files;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class IterateOverFiles {

    public static void main(String[] args) throws IOException {

        List<Path> files = iterateWithVisitor(Path.of("iterateoverfiles"));
        System.out.println(files);

        for(Path file: files) {
            System.out.println(Files.readString(file));
        }
    }

    public static List<Path> iterateWithVisitor(Path dir) {
        List<Path> files = new ArrayList<>();

        FileVisitor<Path> allFiles = new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("File visited: " + file.toString());
                files.add(file);
                // or copy, delete, modify, other
                return FileVisitResult.CONTINUE;
            }
        };

        try {
            Files.walkFileTree(dir, allFiles);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        return files;
    }
}
