package ex035;
import HelpfulMethods.Methods;

import java.util.ArrayList;
import java.util.Random;

/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */


public class App
{
    public static void main( String[] args )
    {
        ArrayList<String> names = populateArray();
        int randomNum = randomSize(names);
        String winner = pickRandom(names,randomNum);
        System.out.println("The winner is..." + winner + ".");
    }

    public static ArrayList<String> populateArray()
    {
        ArrayList<String> temp = new ArrayList<>();
        do
        {
            String toAdd = Methods.inputOutput("Enter a name: ");
            if (toAdd.equals(""))
                break;

            temp.add(toAdd);
        }while (true);
        return temp;
    }

    public static String pickRandom(ArrayList<String> names, int i)
    {
        return names.get(i);
    }

    public static int randomSize(ArrayList<String> names)
    {
        Random rand = new Random(0);
        return rand.nextInt(names.size());

    }
}