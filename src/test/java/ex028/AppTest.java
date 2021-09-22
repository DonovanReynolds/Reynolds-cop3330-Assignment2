package ex028;
import static ex028.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Test for sum")
    public void testSum()
    {
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 10000; i++)
        {
            arr[i%4] = i;
            sum += i;
            if(i%4 == 0)
            {
                assertEquals(sum, sum(arr));
                sum = 0;
            }

        }
    }
}
