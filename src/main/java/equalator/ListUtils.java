package equalator;

import lombok.Employee;
import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class ListUtils {


    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Action<T> action) {
        for (T t : list) {
            action.call(t);
            Thread.sleep(delay);
        }
    }

    public static <T> int countDuplicates(List<T> list, T t,Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Scala", "Groovy");
        forEachWithDelay(strings, 1000, s -> System.out.println(s));
    }

}
