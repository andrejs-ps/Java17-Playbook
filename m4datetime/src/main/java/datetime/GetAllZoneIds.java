package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Inspired by:
 * https://www.mkyong.com/java8/java-display-all-zoneid-and-its-utc-offset/
 */
public class GetAllZoneIds {

    public static final boolean SORT_BY_REGION = true;

    public static void main(String[] args) {

        ZoneId.getAvailableZoneIds()
                .forEach(System.out::println);

        Map<String, String> sortedMap = new LinkedHashMap<>();
        Map<String, String> allZoneIdsAndItsOffSet = getAllZoneIdsAndItsOffSet();


        if (SORT_BY_REGION) {
            allZoneIdsAndItsOffSet.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
        } else {

            allZoneIdsAndItsOffSet.entrySet().stream()
                    .sorted(Map.Entry.<String, String>comparingByValue().reversed())
                    .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
        }

        sortedMap.forEach((k, v) -> System.out.printf("%35s (UTC%s) %n", k, v));
    }

    private static Map<String, String> getAllZoneIdsAndItsOffSet() {

        Map<String, String> result = new HashMap<>();

        LocalDateTime localDateTime = LocalDateTime.now();

        for (String zoneId : ZoneId.getAvailableZoneIds()) {

            ZoneId id = ZoneId.of(zoneId);

            //replace Z to +00:00
            String offset =  localDateTime.atZone(id)
                            .getOffset().getId().replaceAll("Z", "+00:00");

            result.put(id.toString(), offset);

        }
        return result;
    }
}
