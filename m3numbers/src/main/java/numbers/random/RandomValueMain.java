package numbers.random;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class RandomValueMain {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt());
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(7, 11));

        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());

        var threadSafeRandom = ThreadLocalRandom.current();

        System.out.println(threadSafeRandom.nextInt());
        System.out.println(threadSafeRandom.nextInt(5, 10));
        System.out.println(threadSafeRandom.nextDouble());

    }
}
