package files;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetTheCurrentDirectory {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));

        System.out.println(Path.of("").toAbsolutePath());

    }
}
