package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AddSubtractPeriods {

    public static void main(String[] args) {

        // "your scheduled appointment is in X days..."
        var date = LocalDate.now();

        System.out.println(date);
        System.out.println(date.plusDays(1));
        System.out.println(date.plusWeeks(1));
        System.out.println(date.plusMonths(3));
        System.out.println(date.plusYears(5));

        System.out.printf("Your scheduled appointment will take place in %s days",
                            date.plusMonths(1).getDayOfYear() - date.getDayOfYear());


        System.out.println(date.plus(1, ChronoUnit.DECADES));
        System.out.println(date.plus(1, ChronoUnit.MINUTES));

        Period period = Period.of(0, 1 , 5);
        System.out.println(date.plus(period));

    }
}

