package numbers.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class RoundingModes {

    public static void main(String[] args) {

        // don't do this
        int truncated = (int) 4.6;
        System.out.println(truncated);  // 4

        System.out.println("Ceil-floor");
        System.out.println(Math.ceil(4.1));  // 5.0 - double
        System.out.println(Math.floor(4.9)); // 4.0 - double

        System.out.println(Math.ceil(-4.1));    // -4.0 - towards positive infinity
        System.out.println(Math.floor(-4.9));   // -5.0 - towards negative infinity


        System.out.println("Round()");
        System.out.println(Math.round(4.5)); // 5
        System.out.println(Math.round(4.4)); // 4


        System.out.println(Math.round(-1.1)); // -1
        System.out.println(Math.round(-2.5)); // -2

    }
}
