package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateListAndAddElement {

    public static void main(String[] args) {

        List<String> strings3 = new ArrayList<>(Arrays.asList("a", "b"));
        strings3.add("c"); // change or resize


        List<String> strings2 = Arrays.asList("a", "b", null);
        strings2.set(0, "c"); // change but you cannot resize


        List<String> strings = List.of("a", "b"); // prefer immutable lists
    }
}
