package dates;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDatesDemo {

    public static void main(String[] args) {

        var date = LocalDateTime.now();
        System.out.println(date);

        var isoDate = DateTimeFormatter.ISO_DATE.format(date);
        System.out.println(isoDate);

        var basicIsoDate = DateTimeFormatter.BASIC_ISO_DATE.format(date);
        System.out.println(basicIsoDate);

        var someDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(date);
        System.out.println(someDate);

        var someDate2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(date);
        System.out.println(someDate2);



        var someDate3 = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.SHORT).withLocale(new Locale("en", "US"))
                .format(date);
        System.out.println(someDate3);

        var someDate4 = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.SHORT).withLocale(new Locale("fr", "FR"))
                .format(date);
        System.out.println(someDate4);


        String europeanPattern = "dd-MM-yyyy";
        String usPattern = "MM.dd.yyyy";
        var fixedDate = LocalDate.of(2022, 10, 31);

        System.out.println(DateTimeFormatter.ofPattern(europeanPattern).format(fixedDate));
        System.out.println(DateTimeFormatter.ofPattern(usPattern).format(fixedDate));



    }
}
