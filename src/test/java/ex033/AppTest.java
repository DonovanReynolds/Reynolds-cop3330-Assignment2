package ex033;
import static ex033.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class AppTest {

    @Test
    @DisplayName("Test for yes")
    public void testYes()
    {
        assertEquals("Yes" , output(0));
    }
    @Test
    @DisplayName("Test for No")
    public void testNo()
    {
        assertEquals("No" , output(1));
    }
    @Test
    @DisplayName("Test for Ask again")
    public void testAskAgain()
    {
        assertEquals("Ask again later." , output(2));
    }

}