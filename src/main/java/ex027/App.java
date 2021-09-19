package ex027;
import HelpfulMethods.Methods;

import java.util.Locale;

/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {
    public static void main( String[] args )
    {
        String print = validateInput();
        System.out.println(print);
    }

    public static String validateInput()
    {
        String output;
        output = validateName(Methods.inputOutput("Enter the first name:"));
        output += validateLastName(Methods.inputOutput("Enter the last name:"));
        output += validateZip(Methods.inputOutput("Enter the ZIP code:"));
        output += validateEmployeeID(Methods.inputOutput("Enter the employee ID:"));
        if (output.equals(""))
            output = "There were no errors found";
        return output;
    }

    public static String validateName(String name)
    {
        String nameError = "";
        if(name.equals(""))
        {
            nameError = "The first name must be filled in.\n";
        }
        if(name.length() < 2)
        {
            nameError += "The first name must be at least 2 characters long.\n";
        }
        return nameError;
    }

    public static String validateLastName(String lastName)
    {
        String nameError = "";
        if(lastName.equals(""))
        {
            nameError = "The last name must be filled in.\n";
        }
        if(lastName.length() < 2)
        {
            nameError +=  "The last name must be at least 2 characters long.\n";
            return nameError;
        }

        return "";
    }

    public static String validateZip(String zip)
    {
        int zipNumber;
        try
        {
            zipNumber = Integer.parseInt(zip);
            if (zipNumber >= 100000 || zipNumber < 10000)
            {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException e)
        {
            return "The zipcode must be a 5 digit number.\n";
        }
        return "";
    }

    public static String validateEmployeeID(String ID)
    {
        String error = "The employee ID must be in the format of AA-1234\n";
        for(int i = 0; i < ID.length();i++)
        {
            if (i < 2)
            {
                if (!Character.isLetter(ID.toUpperCase().charAt(i)))
                {
                    return error;
                }
            }
            else if(i == 2)
            {
                if (ID.charAt(i) != '-')
                {
                    return error;
                }
            }
            else
            {
                if (!Character.isDigit(ID.charAt(i)))
                {
                    return error;
                }
            }
        }

        return "";
    }

}
