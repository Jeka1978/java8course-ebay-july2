package equalator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class ListUtilsTest {
    @Test
    public void countDuplicates() throws Exception {
        List<String> strings = Arrays.asList("Java", "java", "Java", "JaVA");
        int duplicates = ListUtils.countDuplicates(strings, "java", (t1, t2) -> t1.equalsIgnoreCase(t2));
        Assert.assertEquals(4,duplicates);


    }

}