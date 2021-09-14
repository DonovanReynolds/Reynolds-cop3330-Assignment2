package ex026;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
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
        PaymentCalculator calc = new PaymentCalculator(12,5000,100);
        assertEquals(70, calc.calculateMonthsUntilPaidOff());

    }
    @Test
    @DisplayName("Test2")
    public void test2()
    {
        PaymentCalculator calc = new PaymentCalculator(23,12632,300);
        assertEquals(87, calc.calculateMonthsUntilPaidOff());

    }
    @Test
    @DisplayName("Test3")
    public void test3()
    {
        PaymentCalculator calc = new PaymentCalculator(1,500,25);
        assertEquals(21, calc.calculateMonthsUntilPaidOff());

    }
    @Test
    @DisplayName("Test4")
    public void test4()
    {
        PaymentCalculator calc = new PaymentCalculator(8,2154.25,27.37);
        assertEquals(112, calc.calculateMonthsUntilPaidOff());

    }


}
