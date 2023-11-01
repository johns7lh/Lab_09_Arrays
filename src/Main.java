import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE]; // from 0-99
        Random rnd = new Random();
        int val = rnd.nextInt(100);  // gives a value from 0 to 99
        Scanner in = new Scanner(System.in);

        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1; // adding 1 shifts the entire range to be from 1 - 100
        }
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.printf("%1d | ", dataPoints[e]);

        }
        System.out.println("");

        //Calculate average of values
        int sum = 0;
        int avg = 0;
        for(int e = 0; e < dataPoints.length; e++) {
            sum = sum + dataPoints[e];
            avg = sum / dataPoints[e];

        }
        System.out.println("the sum of the data is: " +sum);
        System.out.println("The average of the data is: " +avg);



        //minimum and maximum
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(min > dataPoints[e])
            {
                min = dataPoints[e];
            }
            if(max < dataPoints[e])
            {
                max = dataPoints[e];
            }
        }
        System.out.println("\nThe minimum is: " + min);
        System.out.println("The maximum is: " + max);



        int Target = 0;
        int searchCounter = 0;
        boolean foundTarget = false;
        Target = SafeInputA.getRangedInt(in, "\nEnter value to search for: ", 1 , 100); // used safe int method


        for(int e = 0; e < dataPoints.length; e++)
        {
            if(dataPoints[e] == Target)
            {
                foundTarget = true;
                System.out.println("Found " + Target + " at index " + e); // shows all instances of searchTarget
                searchCounter++;
            }
        }
        System.out.println("Your number was found " + searchCounter + " time(s).");
        if (!foundTarget) // goes after for loop
        {
            System.out.println("Target " + Target + " was not found!");
        }

        System.out.println("Average of the data points is: " + getAverage((dataPoints)));

    }
    public static double getAverage(int values[])
    {

        Scanner in = new Scanner(System.in);

        int howMany = SafeInputA.getInt(in, "Enter how many values you will be calculating the average of");

        int[] getAverage = new int[howMany];

        System.out.println("Enter " + howMany + " numbers");

        for(int e = 0; e < howMany; e++)
        {
            getAverage[e] = in.nextInt();
        }

        int sum = 0;
        for(int e = 0; e < getAverage.length; e++)
        {
            sum = sum + getAverage[e]; // sum += e
        }
        int ave = sum / getAverage.length;

        return ave;

    }


}




