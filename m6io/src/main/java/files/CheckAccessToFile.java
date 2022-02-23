package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import static java.nio.file.Files.*;

public class CheckAccessToFile {

    static String filePath = "m6io/src/main/resources/";

    public static void main(String[] args) throws IOException {

        Path file = Path.of(filePath);

        if (isFileAccessible(file)) {
            System.out.println(readString(file));
        } else {
            System.out.println("Do something else");
        }

    }

    public static boolean isFileAccessible(Path file) {
        return Files.isRegularFile(file) && Files.isReadable(file);
    }

}
