package demo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class DemoApp {

//    1) Loop over files in dir1, filter for .log files
//    2) Read file - if contains "[ERROR]" - get the file
//    3) At the end create sibling dir, copy the file containing ERROR.

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("demoapp/logs");

        List<Path> logsWithErrors = new ArrayList<>();

        try (DirectoryStream<Path> files = Files.newDirectoryStream(dir, "*.{log}")) {
            for (Path file : files) {
                String content = Files.readString(file);
                if (content.contains("[ERROR]")) {
                    logsWithErrors.add(file);
                }
            }
        }
        System.out.println(logsWithErrors);

        Path logsWithErrorsDir = Path.of("demoapp/errors");
        if (!logsWithErrors.isEmpty()) {
            if(!Files.exists(logsWithErrorsDir)) {
                Files.createDirectory(logsWithErrorsDir);
            }
            for(Path file : logsWithErrors) {
                Files.copy(file, Path.of(String.format("demoapp/errors/%s", file.getFileName().toString())),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }

    }
}
