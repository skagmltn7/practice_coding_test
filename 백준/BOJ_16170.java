package BOJ;
import java.time.*;

public class BOJ_16170 {
    public static void main(String[] args) {
        ZonedDateTime d = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
    }
}