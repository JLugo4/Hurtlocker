import jdk.internal.module.ModuleHashesBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {
    public test() {
    }
    @Before
    public void Init(){
        String result;
    }


    @Test
    public void doesNotContainHashTagTest(){
        String inputString = result;
        boolean testcode = !inputString.contains("##");
        Assert.assertTrue(testcode);
    }
    @Test
    public void testStringContainsErrorFourTimes() {
        String inputString = result;
        int count = 0;
        int fromIndex = 0;
        while ((fromIndex = inputString.indexOf("Error", fromIndex)) != -1) {
            count++;
            fromIndex++;
        }
        Assert.assertEquals(4, count);
    }
    @Test
    public void doesNotContainExpirationTest(){
        String inputString = result;
        boolean testcode = !inputString.contains("expiration");
        Assert.assertTrue(testcode);
    }
    @Test
    public void testStringContainsCookiesSpelledCorrectly() {
        String inputString = result;
        boolean result = inputString.contains("Cookies")
                && !inputString.contains("CoOkieS")
                && !inputString.contains("COokIeS")
                && !inputString.contains("COOkIeS")
                && !inputString.contains("Co0kieS")
                && !inputString.contains("COOkieS");
        Assert.assertTrue(result);
    }
    @Test
    public void testStringContainsNameFourTimes() {
        String inputString = result;
        int count = inputString.split("name", -1).length - 1;
        Assert.assertEquals(4, count);
    }
}

