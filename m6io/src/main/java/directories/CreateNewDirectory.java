package directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateNewDirectory {

    public static void main(String[] args) throws IOException {

        Path newDir = Path.of("newDir");

        if(!Files.exists(newDir)) {
            Files.createDirectory(newDir);
        }

        Files.createDirectories(Path.of("topdir/subdir"));
    }
}
