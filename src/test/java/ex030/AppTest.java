package ex030;
import static ex030.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class AppTest
{

    @Test
    @DisplayName("TimesTable")
    public void testTable()
    {
        int[][] table = new int[12][12];
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12;j++)
            {
                table[i][j] = (i+1)*(j+1);
            }
        }
        assertEquals(table , timesTable());
    }
}