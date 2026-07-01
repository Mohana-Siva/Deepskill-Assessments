import org.junit.Assert;
import org.junit.Test;

public class AssertionExample {

    @Test
    public void testAssertions() {

        int value = 10;
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        String str = "Hello";
        Object obj = null;

        // Checks if two values are equal
        Assert.assertEquals(10, value);

        // Checks if two values are not equal
        Assert.assertNotEquals(5, value);

        // Checks if condition is true
        Assert.assertTrue(value > 5);

        // Checks if condition is false
        Assert.assertFalse(value < 5);

        // Checks if object is null
        Assert.assertNull(obj);

        // Checks if object is not null
        Assert.assertNotNull(str);

        // Checks if two object references are the same
        String s1 = str;
        Assert.assertSame(str, s1);

        // Checks if two object references are different
        String s2 = new String("Hello");
        Assert.assertNotSame(str, s2);

        // Checks if two arrays are equal
        Assert.assertArrayEquals(arr1, arr2);
    }
}