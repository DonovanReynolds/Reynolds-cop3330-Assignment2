package ex037;
import HelpfulMethods.Methods;

import java.util.ArrayList;



/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {
    public static void main(String[] args)
    {
        int minLength = Methods.stringToInt("What's the minimum length?");
        int specialLength = Methods.stringToInt("How many special characters?");
        int numLength = Methods.stringToInt("How many numbers?");
        PasswordGenerator gen = new PasswordGenerator(numLength, minLength, specialLength);

        System.out.println(gen);

    }



}