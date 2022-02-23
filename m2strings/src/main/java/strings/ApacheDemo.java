package strings;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class ApacheDemo {

    public static void main(String[] args) {

        System.out.println(StringUtils.stripAccents("éclair"));  // eclair

        System.out.println(StringUtils.abbreviate("This is a long text", 10));

        System.out.println(RandomStringUtils.randomAlphabetic(2, 10));

    }
}
