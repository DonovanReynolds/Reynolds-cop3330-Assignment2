package ex034;
import HelpfulMethods.Methods;

import java.util.ArrayList;



/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");

        printArray(list);
        String remove = Methods.inputOutput("Enter an employee name to remove:");
        if(removeEmployee(remove,list))
            printArray(list);
    }

    public static boolean removeEmployee(String remove, ArrayList<String> list)
    {
        return list.remove(remove);
    }

    public static void printArray(ArrayList<String> list)
    {
        System.out.println("There are " + list.size() +  " employees");
        for (String s : list) System.out.println(s);
    }


}