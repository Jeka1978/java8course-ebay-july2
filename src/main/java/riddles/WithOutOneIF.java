package riddles;

import stream_lab1.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Evegeny on 25/07/2017.
 */
public class WithOutOneIF {

    // 0-12000 JUN
    //12000-20000 = MIDDLE
    //20001-Integer.MAX_INT = Senior
    public static void main(String[] args) {



        Stream<Employee> stream = Stream.of(
                Employee.builder().name("Sergrey").salary(16000).build(),
                Employee.builder().name("Evgeny").salary(10500).build(),
                Employee.builder().name("Hani").salary(50000).build(),
                Employee.builder().name("Leytal").salary(50000).build(),
                Employee.builder().name("Leytal").salary(50000).build()
        );


        Map<Seniority, List<Employee>> map = stream.collect(Collectors.groupingBy(emp -> Seniority.bySalary(emp.getSalary())));
        System.out.println("map = " + map);


    }
}
