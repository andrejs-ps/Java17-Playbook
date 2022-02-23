package strings;

public class TokenizeDemo {

    public static void main(String[] args) {

        String str = "To whom it may concern \n" +
                "I wish you a good day \n" +
                "Sincerely \n" +
                "Me";

        String[] lines = str.split("\n");
        var sb = new StringBuilder();
        for(String line : lines) {
            sb.append("-> ").append(line);
        }
        System.out.println(sb);

        String text = "Tokyo, 37000000, New York, 20000000, Paris, 11000000";
        String[] lines2 = text.split(",");

        for(int i = 0 ; i < lines2.length ; i = i+2) {
            System.out.println(lines2[i]);
        }

        for(String line : str.split("\n")) {
            for(String token : line.split(",")) {

            }
        }
    }
}
