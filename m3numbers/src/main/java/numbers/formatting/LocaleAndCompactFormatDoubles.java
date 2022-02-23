package numbers.formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleAndCompactFormatDoubles {

    public static void main(String[] args) {

        double myDouble = 1345.9375d;

        System.out.println("Current Locale: " + NumberFormat.getInstance().format(myDouble));
        System.out.println("German Locale: " + NumberFormat.getInstance(Locale.GERMAN).format(myDouble));

        System.out.println("Italian Locale percent: " + NumberFormat.getPercentInstance(Locale.ITALIAN).format(myDouble));
        System.out.println("French Locale percent: " + NumberFormat.getIntegerInstance(Locale.FRENCH).format(myDouble));


        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.FRENCH, NumberFormat.Style.LONG);
        NumberFormat formatter2 = NumberFormat.getCompactNumberInstance(Locale.KOREAN, NumberFormat.Style.SHORT);

        System.out.println(formatter.format(1_000_000));
        System.out.println(formatter2.format(1_000_000));

    }
}
