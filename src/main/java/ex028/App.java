package ex028;
import HelpfulMethods.Methods;


/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {

    public static void main( String[] args )
    {
        int[] arr = makeArr();
        int sum = sum(arr);
        System.out.println(sum);


    }

    public static int[] makeArr()
    {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
        {
            int temp = Methods.stringToInt("Enter a number:");
            arr[i] = temp;

        }
        return arr;
    }

    public static int sum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            sum += arr[i];
        }
        return sum;
    }






}
