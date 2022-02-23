package dates;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenDatesDemo {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2010, 11, 2);
        LocalDate today = LocalDate.now();

        Period age = Period.between(start, today);

        // example: 13 months
        System.out.println(age.getYears() + "y "    // == 1 (12 months)
                + age.getMonths() + "m "            // == 1
                + age.getDays() + "d");

        if(age.getYears() < 18) {
            System.out.println("Sorry, you can't buy this age-restricted item");
        }
    }
}
