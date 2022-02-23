package map;

import java.util.*;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.toMap;

public class MapSort {

    public static void main(String[] args) {

        Map<Integer, String> mapOne = Map.of(20, "Java",
                30, "C#",
                10, "JavaScript",
                40, "Python");
        System.out.println(mapOne);

        System.out.println("TreeMap: " + new TreeMap<>(mapOne));

        Map<Language, String> mapTwo = Map.of(new Language(), "Java", new Language(), "C#", new Language(), "Go");
//        System.out.println(new TreeMap<>(mapTwo));

        System.out.println("Sort by value stream: " + sortByValueStream(mapTwo, Comparator.naturalOrder()));
        System.out.println("Sort by value stream reverse: " + sortByValueStream(mapTwo, Comparator.reverseOrder()));

    }


    public static <K, V> Map<K, V> sortByValueStream(Map<K, V> map, Comparator<? super V> c) {

        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(c))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));
    }

    static class Language {
        String name;

        @Override
        public String toString() {
            return "Language";
        }
    }

}
