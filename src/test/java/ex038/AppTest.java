package ex038;
import static ex038.App.*;

import static org.junit.Assert.*;

import ex037.PasswordGenerator;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;


public class AppTest {

    @Test
    @DisplayName("Test for even numbers")
    public void testEvens()
    {
        String[] testArr = new String[10000];
        for(int i = 0; i < 10000; i++)
        {
            testArr[i] = Integer.toString(i);
        }
        ArrayList<String> finalArray = filterEvenNumbers(testArr);
        int even = 0;
        for(String s: finalArray)
        {
            int num = Integer.parseInt(s);
            assertEquals(num, even);
            even += 2;
        }

    }

}

