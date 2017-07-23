package streams;

import java.nio.file.Files;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class Main {
    public static void main(String[] args) {

        Stream.generate(() -> 1).limit(79).forEach(System.out::println);




        IntStream intStream = IntStream.of(1, 2, 3);

        OptionalInt max = intStream.max();


        Stream<Integer> stream = Stream.of(1, 2, 3).parallel().sequential();
        stream.filter(integer -> integer>2).forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
