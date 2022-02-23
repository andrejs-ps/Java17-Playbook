package list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesAndSimilarElements {


    public static void main(String[] args) {

        List<String> listOne = List.of("USA", "Brazil", "USA", "France", "Egypt", "India", "Japan");

        List<String> listTwo = List.of("USA", "Brazil", "Germany", "Australia");

        Set<String> similar = new HashSet<>(listOne);
        similar.retainAll(listTwo);
        System.out.println(similar);


        Set<String> different = new HashSet<>();
        different.addAll(listOne);
        different.addAll(listTwo);
        different.removeAll(similar);

        System.out.println(different);
    }
}
