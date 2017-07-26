package date_time;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Locale;

/**
 * Created by Evegeny on 25/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime sergey = LocalDateTime.of(1988, 12, 31, 22, 59);

        LocalDateTime dateTime = sergey.plusDays(1);
        System.out.println("dateTime = " + dateTime);
        String displayName = dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.UK);
        System.out.println("displayName = " + displayName);

        long days = ChronoUnit.DAYS.between(sergey, now);
        System.out.println("days = " + days);
    }
}
