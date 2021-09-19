package ex025;

import java.util.Scanner;

public class App {
    /*
     *   UCF COP 3330 Fall 2021 Assignment 2 Solution
     *   Copyright 2021 Donovan Reynolds
     */

    public static void main( String[] args )
    {
        String password = inputOutput("Enter the password:");
        int temp = passwordValidator(password);
        toPrint(temp,password);

    }

    public static int passwordValidator(String password)
    {
        boolean letters = false;
        boolean numbers = false;
        boolean symbol = false;
        for (int i = 0; i < password.length(); i++)
        {
            if (!Character.isDigit(password.charAt(i)))
            {
                letters = true;
            }
            if (Character.isDigit(password.charAt(i)))
            {
                numbers = true;
            }
            if (!Character.isLetterOrDigit(password.charAt(i)))
            {
                symbol = true;
            }
        }
        if (password.length() < 8 && letters)
        {
            return 1;
        }
        else if (password.length() < 8)
        {
            return 0;
        }
        else if (password.length() > 8 && numbers && symbol)
        {
            return 3;
        }
        else if (password.length() > 8 && numbers)
        {
            return 2;
        }
    return -1;


    }

    public static void toPrint(int num, String password)
    {
        if (num == 0)
            System.out.println("The password \"" + password + "\" is a very weak password");
        if (num == 1)
            System.out.println("The password \"" + password + "\" is a weak password");
        if (num == 2)
            System.out.println("The password \"" + password + "\" is a strong password");
        if (num == 3)
            System.out.println("The password \"" + password + "\" is a very strong password");
        if (num == -1)
            System.out.println("The password \"" + password + "\" is a weak password with only letters");

    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

}
