package ex027;
import static ex027.App.*;

import static org.junit.Assert.*;

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
    @DisplayName("Test for FirstNames")
    public void testFirstNames()
    {
        assertEquals("", validateName("John"));
        assertEquals("", validateName("jacob"));
        assertEquals("", validateName("ron"));
        assertEquals("", validateName("mi"));
        assertEquals("", validateName("donovan"));
        assertEquals("", validateName("brie"));
        assertEquals("The first name must be at least 2 characters long.\n", validateName("f"));
        assertEquals("The first name must be at least 2 characters long.\n", validateName("a"));
        assertEquals("The first name must be at least 2 characters long.\n", validateName("b"));
        assertEquals("The first name must be at least 2 characters long.\n", validateName("c"));
        assertEquals("The first name must be filled in.\nThe first name must be at least 2 characters long.\n", validateName(""));
    }

    @Test
    @DisplayName("Test for LastNames")
    public void testLastNames()
    {
        assertEquals("", validateLastName("John"));
        assertEquals("", validateLastName("jacob"));
        assertEquals("", validateLastName("ronny"));
        assertEquals("", validateLastName("mi"));
        assertEquals("", validateLastName("last"));
        assertEquals("", validateLastName("run"));
        assertEquals("The last name must be at least 2 characters long.\n", validateLastName("f"));
        assertEquals("The last name must be at least 2 characters long.\n", validateLastName("a"));
        assertEquals("The last name must be at least 2 characters long.\n", validateLastName("b"));
        assertEquals("The last name must be at least 2 characters long.\n", validateLastName("c"));
        assertEquals("The last name must be filled in.\nThe last name must be at least 2 characters long.\n", validateLastName(""));
    }

    @Test
    @DisplayName("Test for Zip codes")
    public void testZip()
    {
        for (int i = 0; i < 200000;i++)
        {
            if (i >= 10000 && i < 100000)
                assertEquals("", validateZip(Integer.toString(i)));
            else
                assertEquals("The zipcode must be a 5 digit number.\n", validateZip(Integer.toString(i)));
        }
        assertEquals("The zipcode must be a 5 digit number.\n", validateZip(""));
        assertEquals("The zipcode must be a 5 digit number.\n", validateZip("a"));
        assertEquals("The zipcode must be a 5 digit number.\n", validateZip("ab"));
        assertEquals("The zipcode must be a 5 digit number.\n", validateZip("abc"));
        assertEquals("The zipcode must be a 5 digit number.\n", validateZip("abcd"));
        assertEquals("The zipcode must be a 5 digit number.\n", validateZip("abcde"));
        assertEquals("The zipcode must be a 5 digit number.\n", validateZip("abcdef"));
    }
    @Test
    @DisplayName("Test for employeeID")
    public void testID()
    {
        assertEquals("", validateEmployeeID("TK-4321"));
        assertEquals("", validateEmployeeID("rd-9999"));
        assertEquals("", validateEmployeeID("Bd-6541"));
        assertEquals("", validateEmployeeID("jR-5978"));
        assertEquals("", validateEmployeeID("KM-9876"));
        assertEquals("The employee ID must be in the format of AA-1234\n", validateEmployeeID("abcdef"));
        assertEquals("The employee ID must be in the format of AA-1234\n", validateEmployeeID("TK 4569"));
        assertEquals("The employee ID must be in the format of AA-1234\n", validateEmployeeID("TK-abcd"));
        assertEquals("The employee ID must be in the format of AA-1234\n", validateEmployeeID("45-4568"));
        assertEquals("The employee ID must be in the format of AA-1234\n", validateEmployeeID("RB--4587"));
    }

}
