package strings;

import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class ContainsOnlySpecificCharDemo {

    private static final String ONLY_DIGITS = "123";
    private static final String NOT_ONLY_DIGITS = "123A";
    private static final String ONLY_LETTERS = "ABC";
    private static final String NOT_ONLY_LETTERS = "ABC1";


    public static void main(String[] args) {

        IntPredicate isDigit = Character::isDigit;
        IntPredicate isLetter = Character::isLetter;
        IntPredicate isLetterOrDigit = Character::isLetterOrDigit;

        System.out.println(containsOnlyCharacter(ONLY_DIGITS, isDigit));

    }


    public static boolean containsOnlyCharacter(String str, IntPredicate predicate) {
            return str.chars().allMatch(predicate);
    }


    public static boolean containsOnlyCharacter(String str, String regex) {
        return str.matches(regex);
    }


}
