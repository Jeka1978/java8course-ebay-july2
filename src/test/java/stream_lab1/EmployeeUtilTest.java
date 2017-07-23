package stream_lab1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class EmployeeUtilTest {
    @Test
    public void totalPayment() throws Exception {

        List<Employee> employees = Arrays.asList(
                Employee.builder().salary(3).build(),
                Employee.builder().salary(2).build(),
                Employee.builder().salary(1).build(),
                Employee.builder().salary(4).build()
        );

        int totalPayment = EmployeeUtil.totalPayment(employees);
        Assert.assertEquals(10,totalPayment);

    }

}