package HelpfulMethods;

import java.util.Scanner;

public class Methods {
    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }

    public static int stringToInt(String error)
    {
        int temp = 0;
        boolean check = false;
        while(!check)
        {
            String text = inputOutput(error);
            try
            {
                temp = Integer.parseInt(text);
                check = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You entered a value that is not a number. Please try again.");


            }
        }
        return temp;
    }

    public static double stringToDouble (String error)
    {
        double temp = 0.0;
        boolean check = false;
        while(!check)
        {
            String text = inputOutput(error);
            try
            {
                temp = Double.parseDouble(text);
                check = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("You entered a value that is not a number. Please try again.");

            }
        }
        return temp;
    }
}
