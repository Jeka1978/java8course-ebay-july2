package stream_lab1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Evegeny on 23/07/2017.
 */
@Data
@Builder
public class Employee {
    private String name;
    private int salary;
}
