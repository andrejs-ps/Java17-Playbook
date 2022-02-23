package numbers;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class ProgramDemo {

    public static void main(String[] args) {

        var locale = Locale.forLanguageTag(args[0]);
        var style = NumberFormat.Style.valueOf(args[1]);

        List<String> nums = List.of("37000000", "20000000", "11000000");
        // [37 Millionen, 20 Millionen, 11 Millionen]

        var formatter = NumberFormat.getCompactNumberInstance(locale, style);

        List<String> formattedNums = nums.stream()
                .map(Integer::parseInt)
                .map(formatter::format)
                .toList();

        System.out.println(formattedNums);

    }
}
