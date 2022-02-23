package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class MultipleFormatsDemo {

    public static void main(String[] args) {

        var formatBuilder = new DateTimeFormatterBuilder();

        formatBuilder.appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .appendOptional(DateTimeFormatter.ofPattern("MM-dd-yyyy"))
                .appendOptional(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        var formatter = formatBuilder.toFormatter();

        System.out.println(LocalDate.parse("2022-07-22", formatter)); // OK
        System.out.println(LocalDate.parse("22-07-2022", formatter)); // OK
        System.out.println(LocalDate.parse("07-22-2022", formatter)); //fail

    }
}
