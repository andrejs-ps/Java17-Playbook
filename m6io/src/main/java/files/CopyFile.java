package files;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;

public class CopyFile {

    static String resources = "m6io/src/main/resources/";
    static Path filePath = Path.of(resources + "modules.txt");
    static Path filePath2 = Path.of(resources + "modules-copied.txt");

    public static void main(String[] args) throws IOException {

        Files.copy(filePath, filePath2, StandardCopyOption.REPLACE_EXISTING);

    }
}
