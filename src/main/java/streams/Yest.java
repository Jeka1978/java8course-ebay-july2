package streams;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 25/07/2017.
 */
public class Yest {
    @SneakyThrows
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new FileReader("data/yest.txt"));
        Stream<String> lines = reader.lines();
        Stream<String> words = lines.map(String::toLowerCase).flatMap(WordsUtil::getWords);
        Map<String, Long> map = words.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry);


    }
}
