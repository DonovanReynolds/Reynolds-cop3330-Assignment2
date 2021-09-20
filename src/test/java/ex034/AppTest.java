package ex034;
import static ex034.App.*;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;


public class AppTest {

    @BeforeAll
    public ArrayList<String> myArray()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
        return list;
    }


    @Test
    @DisplayName("Test True")
    public void testTrue()
    {

        assertTrue(removeEmployee("John Smith",myArray()));
        assertTrue(removeEmployee("Jackie Jackson",myArray()));
        assertTrue(removeEmployee("Chris Jones",myArray()));
        assertTrue(removeEmployee("Amanda Cullen",myArray()));
        assertTrue(removeEmployee("Jeremy Goodwin",myArray()));
    }

    @Test
    @DisplayName("Test false")
    public void testFalse()
    {
        assertFalse(removeEmployee("Something",myArray()));
        assertFalse(removeEmployee("Somethig",myArray()));
        assertFalse(removeEmployee("Someng",myArray()));
        assertFalse(removeEmployee("Sthing",myArray()));
        assertFalse(removeEmployee("omhing",myArray()));
    }

}
