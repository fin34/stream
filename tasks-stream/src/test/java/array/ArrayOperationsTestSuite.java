package array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        int[] tab = {2, 4, 6, 0};
        double result = ArrayOperations.getAverage(tab);

        Assert.assertEquals(3.0, result, 0.01);
    }
}
