package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplaceDemo {

    public static void main(String[] args) {
        findMatches();
        replace();
    }

    public static void findMatches() {
        String str = "Java 17 Recipes!";

        System.out.println(str.matches("Java 17 Recipes!"));    // exact match - true
        System.out.println(str.matches("Java 17"));             // not exact match - false


        System.out.println(str.matches("[Jj]ava.*"));               // true
        System.out.println(str.matches("Java [0-9]+ Recipes!"));    // true


    }

    private static void replace() {
        String str = "11 Recipes for Java11";
        System.out.println(str.replace("11", "17"));    // replaces all, but takes a char sequence
        System.out.println(str.replaceAll("11", "17")); // replaces all, but takes a regex
        System.out.println(str.replaceFirst("11", "17"));
    }

}
