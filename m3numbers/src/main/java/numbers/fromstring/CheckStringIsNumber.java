package numbers.fromstring;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class CheckStringIsNumber {

    public static void main(String[] args) {

        System.out.println(isNumericLoop("5"));
        System.out.println(isNumericLoop("5a"));

        // works
        System.out.println(isNumericTryCatch("5"));
        System.out.println(isNumericTryCatch("-5"));
        System.out.println(isNumericTryCatch("5.5"));
        System.out.println(isNumericTryCatch("3.30e23"));
        System.out.println(isNumericTryCatch("3.3f"));

        // but - doesn't work
        System.out.println(NumberUtils.isCreatable("your num"));
        System.out.println(isNumericTryCatch("5,5"));

    }

    public static boolean isNumericLoop(String str) {
        for(char c : str.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumericTryCatch(String str) {
       try {
           Double.parseDouble(str);
           return true;
       } catch (NumberFormatException e) {
           return false;
       }

    }
}
