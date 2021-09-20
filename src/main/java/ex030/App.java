package ex030;
import HelpfulMethods.Methods;


/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {
    public static void main( String[] args )
    {
        int[][] table = timesTable();
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12; j++)
                System.out.printf("%5d",table[i][j]);
            System.out.println();
        }

    }


    public static int[][] timesTable()
    {
        int[][] temp = new int[12][12];
        for (int i = 0; i < 12; i++)
        {
            for (int j = 0; j < 12;j++)
            {
                temp[i][j] = (i+1)*(j+1);
            }
        }
        return temp;
    }
}
