package equalator;

import java.util.List;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class ListUtils {

    public static <T> int countDuplicates(List<T> list, T t,Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.equals(t,t1)) {
                counter++;
            }
        }
        return counter;
    }

}
