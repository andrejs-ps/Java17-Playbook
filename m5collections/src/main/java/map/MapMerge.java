package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMerge {

    public static void main(String[] args) {

        Map<Integer, String> mapOne = Map.of(1, "Java", 2, "C#",3, "JavaScript");
        Map<Integer, String> mapTwo = Map.of(3, "Go", 5, "Python",6, "Kotlin");

        Map<Integer, String> mergedMap = new HashMap<>();
        mergedMap.putAll(mapOne);
        mergedMap.putAll(mapTwo);
        System.out.println("putAll: " + mergedMap);


        var mergedMapTwo = Stream.of(mapOne, mapTwo)
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1 + " or " + v2));

        System.out.println(mergedMapTwo);

        Map<String, Integer> mapThree = Map.of("Java", 1, "C#", 2, "JavaScript", 3 );
        Map<String, Integer> mapFour = Map.of("JavaScript", 4, "Python", 5, "Kotlin", 6);

        var mergedMapThree = Stream.of(mapThree, mapFour)
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, Integer::max));

        System.out.println(mergedMapThree);

    }

    public static <K, V> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        return Stream.of(map1, map2)
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v2));
    }
}
