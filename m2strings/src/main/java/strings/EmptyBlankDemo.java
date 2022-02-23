package strings;

public class EmptyBlankDemo {

    public static void main(String[] args) {

        System.out.println("isEmpty()");
        System.out.println("".isEmpty());           // True

        System.out.println("\r".isEmpty());         // False
        System.out.println("\u2002".isEmpty());     // False
        System.out.println(" ".isEmpty());          // False

        System.out.println("isBlank()");
        System.out.println("".isBlank());           // True
        System.out.println("\r".isBlank());         // True
        System.out.println("\u2002".isBlank());     // True
        System.out.println(" ".isBlank());          // True

        System.out.println("Careful!");
        String evilString = "\u2002";
        System.out.println(evilString.trim().isEmpty());        // False! But you might have expected true

        System.out.println(evilString.strip().isBlank());       // redundant
        System.out.println(evilString.isBlank());               // true
    }

}
