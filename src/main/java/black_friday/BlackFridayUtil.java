package black_friday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.DayOfWeek.FRIDAY;

/**
 * Created by Evegeny on 25/07/2017.
 */
public class BlackFridayUtil {
    public static void printBlackDays(int startYear, int endYear) {
        LocalDate startDate = LocalDate.of(startYear, 1, 13);
        LocalDate endDate = LocalDate.of(endYear, 12, 13);
        long numOfMonthes = ChronoUnit.MONTHS.between(startDate, endDate);
        System.out.println("numOfMonthes = " + numOfMonthes);
        Stream<LocalDate> stream = Stream.iterate(startDate, localDate -> localDate.plusMonths(1)).limit(numOfMonthes);
        Map<Integer, Long> map = stream.filter(localDate -> localDate.getDayOfWeek() == FRIDAY).
                collect(Collectors.groupingBy(LocalDate::getYear, Collectors.counting()));
        System.out.println("map = " + map);

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }


    public static void main(String[] args) {
        printBlackDays(1900,1990);
    }
}











