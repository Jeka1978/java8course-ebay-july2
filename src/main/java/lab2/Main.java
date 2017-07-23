package lab2;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Stream<String> lines =
                new BufferedReader(new FileReader("data/yest.txt")).lines();

        long count = lines.peek(System.out::println).
                flatMap(line -> Arrays.stream((line.split(" ")))).
                peek(System.out::println).distinct().peek(System.out::println).count();
        System.out.println("count = " + count);

    }
}
