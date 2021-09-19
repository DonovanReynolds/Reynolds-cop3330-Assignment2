package ex026;
import HelpfulMethods.Methods;

import java.util.Scanner;
/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {

    public static void main( String[] args )
    {
        double balance = Methods.stringToDouble("What is your balance?");
        double apr = Methods.stringToDouble("What is the APR on the card (as a percent)?");
        double monthlyPayment = Methods.stringToDouble("What is the monthly payment you can make?");

        PaymentCalculator calc = new PaymentCalculator(apr,balance,monthlyPayment);

        int months = calc.calculateMonthsUntilPaidOff();
        System.out.println("It will take you " + months + " months to pay off this card.");

    }


}
