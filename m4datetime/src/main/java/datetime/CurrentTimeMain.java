package datetime;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CurrentTimeMain {

    public static void main(String[] args) {

        System.out.println(Instant.now());      // UTC
        System.out.println(LocalDateTime.now());

        System.out.println(LocalDateTime.now(ZoneId.of("America/New_York")));
    }
}
