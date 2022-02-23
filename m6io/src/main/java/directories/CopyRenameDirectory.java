package directories;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyRenameDirectory {

    static String dirPath = "copydir/";

    public static void main(String[] args) throws IOException {

        Files.copy(Path.of(dirPath), Path.of("dircopied"));

//        Files.delete(Path.of(dirPath));

        FileUtils.deleteDirectory(Path.of(dirPath).toFile());
    }
}
