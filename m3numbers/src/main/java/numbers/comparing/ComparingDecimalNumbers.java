package numbers.comparing;

import java.math.BigDecimal;

public class ComparingDecimalNumbers {

    public static void main(String[] args) {

        System.out.println(0.3 == 0.3); // true

        System.out.println(0.1 + 0.2 == 0.3);

        System.out.println(0.1 + 0.2);  // 0.30000000000000004

        double epsilon =  0.00000001; // acceptable_error

        if(Math.abs(0.3 - (0.1 + 0.2)) < epsilon) {
            System.out.println("true");
        }


        var num1 = new BigDecimal("0.1");
        var num2 = new BigDecimal("0.2");

        System.out.println(num1.add(num2).equals(new BigDecimal("0.3")));

    }
}
