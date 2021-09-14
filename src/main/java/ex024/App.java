package ex024;

import java.util.Scanner;

public class App {

    /*
     *   UCF COP 3330 Fall 2021 Assignment 2 Solution
     *   Copyright 2021 Donovan Reynolds
     */
    public static void main(String[] args)
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams");
        String first = inputOutput("Enter the first string:");
        String second = inputOutput("Enter the second string:");

        if (isAnagram(first,second))
        {
            System.out.printf("\"%s\" and \"%s\" are anagrams." , first, second);
        }
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams." , first, second);
    }

    public static boolean isAnagram(String first, String second)
    {
        if (first.length() != second.length())
            return false;

        char[] firstWord = first.toLowerCase().toCharArray();
        char[] secondWord = second.toLowerCase().toCharArray();

        for (int i = 0; i < firstWord.length;i++)
        {
            boolean check = false;
            for (int j = 0; j < secondWord.length; j++)
            {
                if (firstWord[i] == secondWord[j])
                {
                    check = true;
                    secondWord[j] = ' ';
                }
            }
            if (!check)
            {
                return false;
            }
        }
        return true;

    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }
}
