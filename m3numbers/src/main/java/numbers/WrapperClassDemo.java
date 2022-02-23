package numbers;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int five = 5;
        Integer wrappedFive = Integer.valueOf(5);

        System.out.println(five == wrappedFive);

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println(min);
        System.out.println(max);

        System.out.println(Integer.toBinaryString(5));

    }
}
