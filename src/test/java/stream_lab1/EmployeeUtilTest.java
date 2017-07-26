package stream_lab1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static stream_lab1.GENDER.FEMALE;
import static stream_lab1.GENDER.MALE;

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














    @Test
    public void testIsManMoreExpensive(){
        List<Employee> employees = Arrays.asList(
                Employee.builder().gender(MALE).salary(4).build(),
                Employee.builder().gender(MALE).salary(5).build(),
                Employee.builder().gender(MALE).salary(6).build(),
                Employee.builder().gender(FEMALE).salary(10).build(),
                Employee.builder().gender(FEMALE).salary(6).build()
        );

        Assert.assertFalse(EmployeeUtil.isManMoreExpensive(employees));



    }











}