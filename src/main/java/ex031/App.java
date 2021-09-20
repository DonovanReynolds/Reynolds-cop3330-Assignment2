package ex031;
import HelpfulMethods.Methods;


/*
 *   UCF COP 3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Donovan Reynolds
 */

public class App {

    public static void main(String[] args)
    {
        int age = Methods.stringToInt("What is your age?");
        int restingRate = Methods.stringToInt("What is your resting heart rate?");
        int[][] table = calcHeartRate(age,restingRate);
        System.out.println("Resting Pulse: " + restingRate + "     Age: " + age);
        System.out.println("Intensity\t| Rate");
        System.out.println("-------------------------------");
        for (int i = 0; i < 9; i++)
            System.out.printf("%d%%\t\t\t| %d bpm\n" ,table[i][0] , table[i][1]);

    }

    public static int[][] calcHeartRate(int age, int restingHeartRate)
    {
        int[][] temp = new int[9][2];
        temp[0][0] = 55;
        temp[0][1] = formula(age,restingHeartRate,(double)temp[0][0]/100);
        for (int i = 1; i < 9; i++)
        {
            temp[i][0] = temp[i-1][0] + 5;
            temp[i][1] = formula(age,restingHeartRate,(double)temp[i][0]/100);
        }
        return temp;
    }

    public static int formula(int age, int restingHeartRate,double intensity)
    {
        return (int) Math.round((((220 - age) - restingHeartRate) * intensity)  + restingHeartRate);
    }

}
