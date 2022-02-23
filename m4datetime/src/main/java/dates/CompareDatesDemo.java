package dates;

import java.time.LocalDate;

public class CompareDatesDemo {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, 12, 30);
        LocalDate now = LocalDate.now();

        // isBefore() / isAfter()
        System.out.println(date.isAfter(now) ? "Not Yet!" : "Already past!");

    }
}
