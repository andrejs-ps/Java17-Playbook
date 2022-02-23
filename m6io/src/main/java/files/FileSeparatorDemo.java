package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSeparatorDemo {

    static String filePath = "m6io/src/main/resources/modules.txt";
    static String filePath2 = "m6io\\src\\main\\resources\\modules.txt";

    public static void main(String[] args) throws IOException {

        System.out.println(Files.exists(Path.of(filePath)));
        System.out.println(Files.exists(Path.of(filePath2)));

        Path path = Path.of("m6io", "src", "main", "resources", "modules.txt");
    }
}
