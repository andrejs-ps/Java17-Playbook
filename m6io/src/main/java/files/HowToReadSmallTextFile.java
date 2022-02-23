package files;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class HowToReadSmallTextFile {

    static String filePath = "m6io/src/main/resources/modules.txt";

    public static void main(String[] args) throws IOException {

        System.out.println(readSmallFile(filePath));

        readSmallFile(filePath).lines();


        System.out.println(readLineByLine(filePath));

        readLineByLine(filePath).stream();

    }

    public static String readSmallFile(String pathToFile) throws IOException {
        return Files.readString(Path.of(pathToFile));
    }


    public static List<String> readLineByLine(String pathToFile) throws IOException {
            return Files.readAllLines(Path.of(pathToFile));
    }

}
