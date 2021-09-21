package ex040;
import ex039.*;
import HelpfulMethods.Methods;

import java.util.ArrayList;
import java.util.Map;



/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {
    public static void main(String[] args)
    {
        EmployeeMap map = new EmployeeMap();

        String testValue = Methods.inputOutput("Enter a search string:");
        map.findNames(testValue.toLowerCase());
        System.out.println(map);


    }


}
