package directories;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyDeleteDirs {

    public static void main(String[] args) throws IOException {

        Path dir = Path.of("iterateoverfiles");

        // 1 - creates an empty folder
        Files.copy(dir, Path.of("copy-iterateoverfiles"));

        // 2 delete non-empty dir
        Files.delete(dir); // DirectoryNotEmptyException

        // 3 - Apache
        FileUtils.copyDirectory(dir.toFile(), Path.of("copy-iterateoverfiles").toFile());
        FileUtils.deleteDirectory(dir.toFile());
    }
}
