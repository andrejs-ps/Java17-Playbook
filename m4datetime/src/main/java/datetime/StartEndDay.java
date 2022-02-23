package datetime;

import java.time.*;
import java.time.temporal.ChronoField;

public class StartEndDay {

    public static void main(String[] args) throws InterruptedException {

        // sale ends at midnight, X hours left!

        while (true) { // infinite loop!
            Thread.sleep(1000);
            LocalDate today = LocalDate.now();
            LocalTime now = LocalTime.now();
            LocalDateTime nowToday = LocalDateTime.of(today, now);
            LocalDateTime midnightToday = LocalDateTime.of(today, LocalTime.MAX);


            String message = String.format("Hurry, sale ends at midnight, time left: %s hours, %s minutes, %s seconds",
                    midnightToday.getHour() - nowToday.getHour(),
                    midnightToday.getMinute() - nowToday.getMinute(),
                    midnightToday.getSecond() - nowToday.getSecond());
            System.out.println(message);
        }
    }
}
