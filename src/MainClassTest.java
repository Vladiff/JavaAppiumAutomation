import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {
        String a = this.getClassString();

        Assert.assertTrue("getClassString doesn't return hello or Hello",a == "Hello, world");
    }
}
