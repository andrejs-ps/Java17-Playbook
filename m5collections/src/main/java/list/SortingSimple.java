package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingSimple {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(List.of(20, 50, 10));
        ints.sort(Integer::compareTo);
        System.out.println(ints);

        List<Double> doubles = new ArrayList<>(List.of(30.789, 20.551, 20.55));
        doubles.sort(Double::compareTo);
        System.out.println(doubles);


        List<String> strings = new ArrayList<>(List.of("andre", "maria", "Andre"));
        strings.sort(String::compareTo);
        System.out.println(strings);


        strings.sort(Comparator.naturalOrder());
        System.out.println("Natural order: " + strings);

        strings.sort(Comparator.reverseOrder());
        System.out.println("Reverse order: " + strings);

    }
}
