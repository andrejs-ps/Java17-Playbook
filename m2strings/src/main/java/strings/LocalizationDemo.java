package strings;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationDemo {

    public static void main(String[] args) {

        Locale en_US = new Locale("en", "US");
        Locale fr_FR = new Locale("fr", "FR");
        Locale es_ES = new Locale("es", "ES");

        printMessage(en_US);
        printMessage(fr_FR);
        printMessage(es_ES);

    }

    private static void printMessage(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("shop", locale);
        System.out.println(bundle.getString("greeting"));
    }
}
