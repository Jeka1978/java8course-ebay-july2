package stream_lab1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static stream_lab1.GENDER.FEMALE;
import static stream_lab1.GENDER.MALE;
import static stream_lab1.GENDER.SHEMALE;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class EmployeeUtil {
    public static int totalPayment(List<Employee> employees) {
       return employees.parallelStream().mapToInt(Employee::getSalary).sum();
    }

    public static boolean isManMoreExpensive(List<Employee> employees) {
        Map<GENDER, Integer> map = employees.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.summingInt(Employee::getSalary)));
        System.out.println("map = " + map);
        return map.get(MALE) > map.get(FEMALE);
    }
}
