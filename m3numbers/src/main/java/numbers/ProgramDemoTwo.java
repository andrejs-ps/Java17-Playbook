package numbers;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProgramDemoTwo {

    public static void main(String[] args) {

        // Task: add +20% and round to 2 decimals
        // 24.18, 44.66, 69.83
        List<String> prices = List.of("20.15", "37.22", "58.19");

        var formatter = new DecimalFormat("#.00");
        formatter.setRoundingMode(RoundingMode.HALF_UP);

        List<String> pricesWithVat = prices.stream()
                .map(Double::parseDouble)
                .map(price -> price * 1.2)
                .map(formatter::format)
                .toList();

        System.out.println(pricesWithVat);

    }
}
