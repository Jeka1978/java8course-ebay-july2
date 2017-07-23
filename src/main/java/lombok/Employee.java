package lombok;

import lombok.experimental.NonFinal;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by Evegeny on 23/07/2017.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Slf4j
public class Employee {

    @NonNull
    private String name;
    @NonNull
    private Integer age;
    private int id;
    private double salary;
    @Singular
    private List<String> beers;

    @Singular("oneFish")
    private List<String> fish;



    public static void main(String[] args) {
        Employee hana = Employee.builder().age(18).oneFish("Karpion").name("Hana").beer("Kriek").beer("guiness").salary(30000).id(2).build();
        log.info("hana = " + hana);
    }

}











