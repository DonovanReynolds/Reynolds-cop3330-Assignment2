package ex036;
import static ex036.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;


public class AppTest {


    public ArrayList<Integer> makeArr(int x, int y, int z,int a, int b)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(x);
        temp.add(y);
        temp.add(z);
        temp.add(a);
        temp.add(b);
        return temp;
    }

    @Test
    @DisplayName("check Average")
    public void testAverage()
    {
        ArrayList<Integer> test = makeArr(1,2,3,4,5);
        Stats stat = new Stats(test);
        double sum = 0;

        for(Integer i: test)
        {
            sum += i;
        }
        assertEquals(sum/5,stat.average(),.001);
    }

    @Test
    @DisplayName("check min")
    public void testMin()
    {
        ArrayList<Integer> test = makeArr(1,2,3,4,5);
        Stats stat = new Stats(test);
        assertEquals(1,stat.min());

    }

    @Test
    @DisplayName("test max")
    public void testMax()
    {
        ArrayList<Integer> test = makeArr(1,2,3,4,5);
        Stats stat = new Stats(test);
        assertEquals(5,stat.max());
    }


}