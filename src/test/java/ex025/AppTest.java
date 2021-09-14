package ex025;

import static ex025.App.passwordValidator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Test1")
    public void test1()
    {
        assertEquals(0, passwordValidator("12345"));
    }
    @Test
    @DisplayName("Test2")
    public void test2()
    {
        assertEquals(1, passwordValidator("abcdef"));
    }
    @Test
    @DisplayName("Test3")
    public void test3()
    {
        assertEquals(2, passwordValidator("abc123xyz"));
    }
    @Test
    @DisplayName("Test4")
    public void test4()
    {
        assertEquals(3, passwordValidator("1337h@xor!"));
    }
    @Test
    @DisplayName("Test5")
    public void test5()
    {
        assertEquals(-1, passwordValidator("testingforletters"));
    }

}
