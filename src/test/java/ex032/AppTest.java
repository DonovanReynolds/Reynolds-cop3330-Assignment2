package ex032;
import static ex032.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class AppTest {

    int number = 500;


    @Test
    @DisplayName("Test for low")
    public void testLow()
    {
        for (int i = 0; i < 500; i++)
            assertEquals("Too low." , lowOrHigh(number,i));
    }

    @Test
    @DisplayName("Test for High")
    public void testHigh()
    {
        for (int i = 501; i < 1000; i++)
            assertEquals("Too high." , lowOrHigh(number,i));

    }

    @Test
    @DisplayName("The number")
    public void testNum()
    {
        assertEquals("" , lowOrHigh(number,500));
    }
}