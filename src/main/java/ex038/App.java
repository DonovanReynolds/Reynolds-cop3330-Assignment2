package ex038;
import HelpfulMethods.Methods;

import java.util.ArrayList;



/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {
    public static void main(String[] args)
    {
        String[] array = makeArray();
        ArrayList<String> finalArray = filterEvenNumbers(array);
        printArrayList(finalArray);


    }

    public static String[] makeArray()
    {
        String input = Methods.inputOutput("Enter a list of numbers, separated by spaces:");

        return input.split(" ");
    }

    public static ArrayList<String> filterEvenNumbers(String[] testArray)
    {
        ArrayList<String> finalArray = new ArrayList<>();
        for(String s: testArray)
        {
            int num = Integer.parseInt(s);
            if (num%2 == 0)
            {
                finalArray.add(s);
            }
        }
        return finalArray;
    }
    public static void printArrayList(ArrayList<String> arr)
    {
        System.out.print("The even numbers are ");
        for (String s: arr)
        {
            System.out.printf("%s " , s);
        }
    }
}