package strings;

import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinStringsDemo {

    public static void main(String[] args) {

        String delimiter = ";";
        String[] strings = {"11", "12", null, "13", "14", "15", "16", "17"};

        System.out.println(joinOldWay(delimiter, strings));
        System.out.println(joinSimplest(delimiter, strings));
        System.out.println(joinWithJoiner(delimiter, strings));
        System.out.println(joinWithStream(delimiter, strings));
    }

    public static String joinOldWay(String delimiter, String... args) {

        StringBuilder result = new StringBuilder();

        int i;
        for (i = 0; i < args.length - 1; i++) {
            result.append(args[i]).append(delimiter);
        }

        result.append(args[i]);
        return result.toString();
    }


    public static String joinSimplest(String delimiter, String... args) {
        return "[" + String.join(delimiter, args) + "]";
    }


    public static String joinWithJoiner(String delimiter, String... args) {
        var joiner = new StringJoiner(delimiter, "{", "}");
        for(String arg : args) {
            joiner.add(arg);
        }
        return joiner.toString();
    }

    public static String joinWithStream(String delimiter, String... args) {
        return Stream.of(args)
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(delimiter));
    }









}
