package ex029;
import HelpfulMethods.Methods;

import java.util.Locale;

/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {
    public static void main( String[] args )
    {

        int years = 0;
        do {
            String input = Methods.inputOutput("What is the rate of return?");
            years = calculateYears(input);
        } while (years <= 0);

        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    public static int calculateYears(String rate)
    {

            try {
                int rateNum = Integer.parseInt(rate);
                int years = 72 / rateNum;
                if (years > 0)
                    return years;
            } catch (NumberFormatException e) {
                System.out.println("Only enter a number, please try again.");
            } catch (ArithmeticException e) {
                System.out.println("Sorry but you cannot divide by zero, please try again.");
            }
        return 0;
    }

}

