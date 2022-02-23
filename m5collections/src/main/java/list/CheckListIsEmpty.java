package list;

import java.util.List;

public class CheckListIsEmpty {

    public static void main(String[] args) {

        int[] intArray = {};
        System.out.println(intArray.length == 0);

        List<Integer> intList = List.of(1, 2 , 3);
        System.out.println(intList.size() == 0 ); // no!

        System.out.println(intList.isEmpty());

        if(intList.isEmpty()) {
            System.out.println("Is empty");
        }
    }
}
