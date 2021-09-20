package ex029;
import static ex029.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class AppTest
{

    @Test
    @DisplayName("Test for Divide by zero")
    public void testDivideByZero()
    {
        assertEquals(0, calculateYears("0"));
    }
    @Test
    @DisplayName("Test for Letters")
    public void testLetters()
    {
        assertEquals(0, calculateYears("ABCDEFDSFJKLDAS"));
    }
    @Test
    @DisplayName("Test outputs")
    public void testCalculator()
    {
        for (int i = 1; i < 1000; i++)
        {
            assertEquals(72/i, calculateYears(Integer.toString(i)));
        }
    }

}