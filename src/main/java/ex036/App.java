package ex036;
import HelpfulMethods.Methods;

import java.util.ArrayList;

/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */


public class App {

    public static void main (String[] args) {
        ArrayList<Integer> list = popArray();
        Stats temp = new Stats(list);


        System.out.println();
        System.out.println(temp.averageToString());
        System.out.println(temp.minToString());
        System.out.println(temp.maxToString());
        System.out.println(temp.stDevToString());
    }

    public static ArrayList<Integer> popArray()
    {
        ArrayList<Integer> temp = new ArrayList<>();
        while(true)
        {
            String tempString = Methods.inputOutput("Enter a number:");
            try
            {
                Integer num = Integer.parseInt(tempString);
                temp.add(num);
            }
            catch (NumberFormatException e) {
                if (tempString.toLowerCase().equals("done"))
                    break;
                System.out.println("Please only enter a number or done");
            }
        }

        return temp;
    }
}