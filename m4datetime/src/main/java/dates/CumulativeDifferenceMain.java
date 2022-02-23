package dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CumulativeDifferenceMain {

    public static void main(String[] args) {
        LocalDate anniversary = LocalDate.of(2020, Month.NOVEMBER, 5);
        LocalDate today = LocalDate.now();

        long yearsBetween = ChronoUnit.YEARS.between(anniversary, today);
        System.out.println("Years between dates: " + yearsBetween);

        long daysBetween = ChronoUnit.DAYS.between(anniversary, today);
        System.out.println("Days between dates:" + daysBetween);
    }
}
