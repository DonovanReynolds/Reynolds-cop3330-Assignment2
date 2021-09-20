package ex032;
import HelpfulMethods.Methods;

import java.util.Random;


/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App
{

    public static void main(String[] args)
    {
        System.out.println("Let's play Guess the Number!");
        char check = ' ';
        do
        {
            int difficulty = Methods.stringToInt("Enter the difficulty level (1, 2, or 3)");
            int number = generateRandom(difficulty);
            if (number == 0)
            {
                System.out.println("Please only enter 1, 2, or 3");
                continue;
            }
            game(number);
             check = Methods.getFirstChar("Do you wish to play again (Y/N)?");
        } while(check == 'y');

    }

    public static int generateRandom(int num)
    {
        Random rand = new Random();
        if (num == 1)
        {
            return rand.nextInt(10)+1;
        }
        else if(num == 2)
        {
            return rand.nextInt(100)+1;
        }
        else if (num == 3)
            return rand.nextInt(1000)+1;
        else
            return 0;
    }

    public static void game(int number)
    {
        int counter = 1;
        int guess = Methods.stringToIntNoLoop("I have my number what is your guess?");
        while(guess != number)
        {
            counter++;
            System.out.println(lowOrHigh(number, guess));
            guess = Methods.stringToIntNoLoop("Guess again:");
        }
        System.out.println("You got it in " + counter + " guesses!");
    }

    public static String lowOrHigh(int number, int guess)
    {
        if (guess < number)
            return "Too low.";
        else if (number < guess)
            return "Too high.";
        else
            return "";
    }

}