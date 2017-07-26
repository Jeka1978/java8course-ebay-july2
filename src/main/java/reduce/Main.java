package reduce;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 25/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Moshe", "Masha", "Gay");
        Optional<String> optional = stream.reduce((s, s2) -> s + "," + s2);
        System.out.println(optional.get());
    }
}
