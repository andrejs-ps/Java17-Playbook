package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveFile {

    static String resources = "m6io/src/main/resources/";

    public static void main(String[] args) throws IOException {

        // This will rename the file if the specified directory is the same
        Files.move(Path.of(resources + "move_me.txt"),
                Path.of(resources + "move_me-new.txt"), StandardCopyOption.REPLACE_EXISTING);

    }
}
