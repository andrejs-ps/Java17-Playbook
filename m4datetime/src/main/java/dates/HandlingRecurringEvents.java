package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class HandlingRecurringEvents {

    public static void main(String[] args) {

        // Task - meeting every Friday. Print all meetings for the month
        var today = LocalDate.now();
        var start = today.with(TemporalAdjusters.firstDayOfMonth());
        var stop = today.with(TemporalAdjusters.lastDayOfYear());

        var firstFriday = start.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

        System.out.println("Start date " + start);
        System.out.println("End date " + stop);

        List<LocalDate> fridays = new ArrayList<>();

        while(firstFriday.isBefore(stop) || firstFriday.isEqual(stop)) {
            fridays.add(firstFriday);
            firstFriday = firstFriday.plusWeeks(1); // move to the next Friday
        }

        System.out.printf("From %s to %s, Fridays will be on %s%n", start, stop, fridays);

    }
}
