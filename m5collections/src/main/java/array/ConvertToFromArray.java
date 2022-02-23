package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertToFromArray {

    public static void main(String[] args) {

        String[] stringsArr = {"1", "2", "3"};
        List<String> stringList = new ArrayList<>(List.of(stringsArr));

        System.out.println("List Before: " + stringList);
        stringList.add("4");
        stringList.add("5");
        stringList.remove("1");
        System.out.println("List After: " + stringList);

        String[] strings = stringList.toArray(String[]::new);
        System.out.println("Back to array: " + Arrays.toString(strings));

        int[] intArr = {1, 2, 3};
        // int and Integer are incompatible here
//        List<Integer> intList =  Arrays.asList(intArr);



        Integer[] integerArr = {1, 2, 3};
        List<Integer> intList = Arrays.asList(integerArr);




        int[] ints = {1, 2, 3, 4, 5};
        List<Integer> intList2 = Arrays.stream(ints)
                .filter( n -> n < 4)
                .boxed()
                .toList();

        intList2.add(100);
    }
}
