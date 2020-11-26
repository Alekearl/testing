import org.junit.Assert;
import org.junit.Test;

public class TestTesting {

    @Test
    public void testMethodOne() {
        String arrayOne = Testing.someString(new String[]{"Hello", "from", "an", "array."});
        Assert.assertEquals("Hello from an array.", arrayOne);
    }

}
