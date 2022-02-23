package demo;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class DemoAppRefactored {

    public static void main(String[] args) throws IOException {

        Path dir = Path.of("demoapp/logs");

        List<Path> logsWithErrors;

        try (DirectoryStream<Path> files = Files.newDirectoryStream(dir, "*.{log}")) {
            logsWithErrors = getLogsWithErrors(files);

        }

        Path logsWithErrorsDir = Path.of("demoapp/errors");

        if (logsWithErrors.isEmpty()) {
            return;
        }

        if (!Files.exists(logsWithErrorsDir)) {
            Files.createDirectory(logsWithErrorsDir);
        }
        for (Path file : logsWithErrors) {
            Files.copy(file, Path.of(String.format("demoapp/errors/%s", file.getFileName().toString())),
                    StandardCopyOption.REPLACE_EXISTING);
        }

    }

    private static List<Path> getLogsWithErrors(DirectoryStream<Path> files) throws IOException {
        List<Path> logsWithErrors = new ArrayList<>();
        for (Path file : files) {
            String content = Files.readString(file);
            if (content.contains("[ERROR]")) {
                logsWithErrors.add(file);
            }
        }
        return logsWithErrors;
    }

}
