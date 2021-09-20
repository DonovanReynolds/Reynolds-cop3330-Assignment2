package ex031;
import static ex031.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class AppTest {

    @Test
    @DisplayName("Test for formula")
    public void testFormula()
    {
        for (int i = 0; i < 100; i++)
        {
            for (int j = 60; j < 100; j++ )
            {
                for (double k = 55; k < 100; k+= 5)
                {
                    int targetRate = (int)Math.round(((220 - i) - j)*(k/100) + j);
                    assertEquals(targetRate, formula(i,j,k/100));
                }

            }
        }
    }
}
