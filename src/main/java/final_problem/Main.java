package final_problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class Main {
    public static void main(String[] args) {

       int x = 0;
        List<String> strings = Arrays.asList("a", "b");
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                System.out.println(x);
                return 0;
            }
        });
        x++;
    }
}
