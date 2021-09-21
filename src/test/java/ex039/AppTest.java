package ex039;
import static ex039.App.*;

import static org.junit.Assert.*;

import ex037.PasswordGenerator;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;


public class AppTest {

    @Test
    @DisplayName("Test for order")
    public void testOrder()
    {
        EmployeeMap test = new EmployeeMap();
        ArrayList<String> employees = new ArrayList<>();
        ArrayList<String> sorted = new ArrayList<>();

        for(Map.Entry<String, Employee> entry : test.getSortedEmployees().entrySet())
        {
            String lastName = entry.getValue().getLastName();
            employees.add(lastName);
            sorted.add(lastName);
        }
        Collections.sort(sorted);
        assertEquals(sorted, employees);

    }

    @Test
    @DisplayName("Test for Employee made properly")
    public void testEmployee()
    {
        String firstName = "FirstName";
        String secondName = "SecondName";
        String position = "Position";
        String separation = "Separation";

        Employee test = new Employee(firstName,secondName,position,separation);
        Employee test2 = new Employee(firstName,secondName,position);

        assertEquals(firstName,test.getFirstName());
        assertEquals(secondName,test.getLastName());
        assertEquals(position,test.getPosition());
        assertEquals(separation,test.getSeparationDate());

        assertEquals(firstName,test2.getFirstName());
        assertEquals(secondName,test2.getLastName());
        assertEquals(position,test2.getPosition());
        assertEquals("",test2.getSeparationDate());

    }
}