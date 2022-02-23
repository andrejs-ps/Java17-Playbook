package dates;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class StartEndOfPeriodDemo {

    public static void main(String[] args) {

        // Print: Hurry! Sale ends at the end of the month!, x Days remaining
        LocalDate today = LocalDate.now();
        LocalDate endOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(today);
        System.out.println(endOfMonth);

        String message = String.format("Hurry! The sale ends at the end of the month, %s day(s) remaining!",
                endOfMonth.getDayOfMonth() - today.getDayOfMonth());

        System.out.println(message);

    }
}
