package demoapp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DemoAppTwo {

    // Using the current ZoneId AND today's Date, and given a specific time
    // print time in other time zones
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        List<String> zones = List.of("America/New_York", "Europe/London", "Asia/Kolkata");

        printTimes(time, zones);
    }

    static void printTimes(LocalTime time, List<String> otherZoneIDs) {

        ZonedDateTime dateTime = time.atDate(LocalDate.now()).atZone(ZoneId.systemDefault());

        System.out.println(dateTime.getZone() + " " + dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.println("===================");

        for(var zone : otherZoneIDs) {
            ZonedDateTime otherTime = dateTime.withZoneSameInstant(ZoneId.of(zone));
            System.out.println(zone + " " + otherTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        }
    }
}
