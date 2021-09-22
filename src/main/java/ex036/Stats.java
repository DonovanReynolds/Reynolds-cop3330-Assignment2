package ex036;

import java.util.ArrayList;

public class Stats {

    private ArrayList<Integer> numbers;
    private final int size;

    public Stats(ArrayList<Integer> numbers)
    {
        this.size = numbers.size();
        this.numbers = numbers;
    }

    public  double average()
    {
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            sum += numbers.get(i);
        }
        return (double)sum/size;
    }

    public int min()
    {
        int min = numbers.get(0);
        for(int i = 0; i< size; i++)
        {
            if (min > numbers.get(i))
            {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public int max()
    {
        int max = numbers.get(0);
        for (int i = 0; i< size; i++)
        {
            if (max < numbers.get(i))
            {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public double stDev()
    {
        double standardDeviation = 0;
        double mean = average();

        for(int num: numbers)
        {
            standardDeviation += Math.pow((double)num - mean,2);
        }
        return Math.sqrt(standardDeviation/size);
    }

    public String averageToString()
    {
        return String.format("The average is %.1f" , this.average());
    }
    public String minToString()
    {
        return "The average is " + this.min();
    }
    public String maxToString()
    {
        return "The average is " + this.max();
    }
    public String stDevToString()
    {
        return String.format("The standard deviation is %.2f",this.stDev());
    }
    

}