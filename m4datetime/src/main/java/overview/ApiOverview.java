package overview;

import java.time.*;

public class ApiOverview {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());
        System.out.println(Instant.now().toEpochMilli());
        System.out.println(System.currentTimeMillis());

        System.out.println(ZonedDateTime.now());
    }
}
