package files;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {

    static String dirPath = "m6io/src/main/resources/deletedir/";

    public static void main(String[] args) throws IOException {

        Path file = Path.of(dirPath + "delete_me.txt");

        Files.delete(file); // void - NoSuchFileException if file doesn't exist

        System.out.println(Files.deleteIfExists(file));

    }
}
