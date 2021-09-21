package ex040;
import static ex040.App.*;

import static org.junit.Assert.*;

import ex037.PasswordGenerator;
import ex039.Employee;
import ex039.EmployeeMap;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;


public class AppTest {



    @Test
    @DisplayName("Test sort")
    public void testFind() {
        EmployeeMap map = new EmployeeMap();
        EmployeeMap map2 = new EmployeeMap();
        map.findNames("jac");
        map2.findNames("jac");
        assertEquals(map.getSortedEmployees(),map2.getSortedEmployees());


    }
}