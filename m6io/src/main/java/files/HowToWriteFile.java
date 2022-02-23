package files;

import jdk.dynalink.StandardOperation;

import java.io.*;
import java.nio.file.*;
import java.time.Instant;
import java.util.List;

public class HowToWriteFile {

    static String filePath = "m6io/src/main/resources/write_to_me.txt";

    public static void main(String[] args) throws IOException {

        Files.writeString(Path.of(filePath), "some str\n");

//        Files.writeString(Path.of(filePath), "another str\n", StandardOpenOption.CREATE_NEW);

        Files.writeString(Path.of(filePath), "some str 2\n", StandardOpenOption.APPEND);

        Files.writeString(Path.of(String.format("m6io/src/main/resources/write_to_me-%s.txt",
                Instant.now().toString().replace(":","-"))), "some str\n");

        Files.writeString(Path.of(filePath), "");


        List<String> strings = List.of("one", "two", "three");

        // No
        for(String string : strings) {
            Files.writeString(Path.of(filePath), string + System.lineSeparator(), StandardOpenOption.APPEND);
        }

        // Yes
        StringBuilder sb = new StringBuilder();
        for(String string : strings) {
            sb.append(string).append(System.lineSeparator());
        }

        Files.writeString(Path.of(filePath), sb.toString(), StandardOpenOption.APPEND);
    }
}
