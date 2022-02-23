package dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class ConvertOldDateDemo {

    public static void main(String[] args) {

        Date in = new Date(); // from an external API

        LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
        LocalDateTime ldt2 = LocalDateTime.ofInstant(in.toInstant(), ZoneId.of("America/New_York"));

        Date out = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println(in);
        System.out.println(ldt);
        System.out.println(ldt2);
        System.out.println(out);

    }
}
