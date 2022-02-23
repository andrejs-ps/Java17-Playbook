package numbers.comparing;

public class ComparingWholeNumbers {


    public static void main(String[] args) {

        System.out.println(127 == 127);
        System.out.println(128 == 128);

        System.out.println(Integer.valueOf("127") == Integer.valueOf("127"));
        System.out.println(Integer.valueOf("128") == Integer.valueOf("128"));


        System.out.println(Integer.valueOf("128").equals(Integer.valueOf("128")));

        System.out.println(Integer.valueOf("128").compareTo(Integer.valueOf("128")));
    }
}
