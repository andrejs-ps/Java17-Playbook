package strings;

public class CompareStringsDemo {

    public static void main(String[] args) {

        System.out.println("abc" == "abc");

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
