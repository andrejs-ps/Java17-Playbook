package array;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {

        String[] arr = { "1", "2", "3" };
        arr[2] = "10";

        System.out.println(Arrays.toString(arr));
        String[] arr2 = append(arr, "4");
        System.out.println(Arrays.toString(arr2));

    }

    static <T> T[] append(T[] sourceArray, T newElement) {
        int origLength = sourceArray.length;
        T[] newArray = Arrays.copyOf(sourceArray, origLength * 2);
        newArray[origLength] = newElement;
        return newArray;
    }
}

