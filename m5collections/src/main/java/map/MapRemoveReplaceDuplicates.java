package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapRemoveReplaceDuplicates {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>(Map.of(
                1, "Java",
                2, "C#",
                3, "JavaScript",
                4, "Python",
                5, "Go",
                6, "Kotlin"
        ));

        map.remove(1);
        System.out.println("Simple remove: "  + map);

        map.entrySet().removeIf(entry -> entry.getValue().endsWith("#"));
        System.out.println("Removed by checking value: " + map);

        map.entrySet().removeIf(entry -> entry.getKey().equals(3));
        System.out.println("Removed by checking key: " + map);


        map.replace(4, "Go");
        System.out.println("Simple replace:" + map);



        BiFunction<Integer, String, String> replace = (k, v) -> {
            if("Go".equals(v) || k == 6) {
                return "Java";
            }
            return v;
        };

        map.replaceAll(replace);
        System.out.println(map);

    }
}
