package collect;

import lombok.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparingInt;

/**
 * Created by Evegeny on 25/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Stream<Employee> stream = Stream.of(
                Employee.builder().name("Sergey").build(),
                Employee.builder().name("HANA").build(),
                Employee.builder().name("SHIRA").build(),
                Employee.builder().name("VIKA").build(),
                Employee.builder().name("Evgeny").build()
        );


        List<String> list = stream.map(Employee::getName).filter(name -> name.toUpperCase().equals(name))
                .sorted(comparingInt(String::length)).collect(Collectors.toList());

        System.out.println("list = " + list);


    }
}














