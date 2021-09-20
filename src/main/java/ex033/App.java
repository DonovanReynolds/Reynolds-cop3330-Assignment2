package ex033;
import HelpfulMethods.Methods;

import java.util.ArrayList;
import java.util.Random;


/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {
    public static void main( String[] args )
    {
        String input = Methods.inputOutput("What's your question?");
        //System.out.println(output(randomNumber()));
        System.out.println("Yes you will find the one. AKA T1.");

    }
    public static int randomNumber()
    {
        Random rand = new Random();
        return rand.nextInt(3);
    }
    public static String output(int number)
    {
        ArrayList <String> list = new ArrayList <String>();
        list.add("Yes");
        list.add("No");
        list.add("Ask again later.");

        return list.get(number);
    }
}
