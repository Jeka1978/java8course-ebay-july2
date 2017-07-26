package riddles;

import stream_lab1.Employee;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 25/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        Stream<Employee> stream = Stream.of(
                Employee.builder().name("moshe").salary(1000).build(),
                Employee.builder().name("moshe").salary(2000).build()
        );

        Map<String, Integer> map = stream.collect(Collectors.toMap(Employee::getName, Employee::getSalary,
                (salary1, salary2) -> salary1+salary2));
        System.out.println("map = " + map);
    }
}
