package predicate;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("arnold");
        strings.add("silvester");
        strings.add("chuck norris");
        strings.add("van dam");

        String heroToRemove = "chuck norris";

        strings.removeIf(next -> true);

        System.out.println(strings);














    }
}
