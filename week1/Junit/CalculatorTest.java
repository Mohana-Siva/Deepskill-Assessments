import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
public class CalculatorTest {

    @Test
    public void testSample() {
       int value = add(2,4);
       
        Assert.assertEquals("Values are not Equal",6,value);
        Assert.assertTrue(add(2,3)==5);
        Assert.assertFalse(add(3,3)==5);

    }
    public int add(int a,int b){
        return a+b;
    }
}