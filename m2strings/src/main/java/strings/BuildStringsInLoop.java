package strings;

public class BuildStringsInLoop {

    public static void main(String[] args) {

        var builder = new StringBuffer("abc").reverse();    // thread-safe

        System.out.println(builder);

    }
}
