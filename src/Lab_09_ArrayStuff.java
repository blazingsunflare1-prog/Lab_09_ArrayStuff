//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        Random rnd = new Random();
        int  rangeInt = 0;
        int intPosition = 0;


        int numAvg = 0;

        int[] dataPoints;
        dataPoints = new int[100];

        for(int j = 0; j< dataPoints.length; j++){
            dataPoints[j] = rnd.nextInt(100) + 1;
            System.out.print(dataPoints[j]);
            for (int i=0;i<1;i++){
                System.out.print("|");
            }
            for (int i=0;i<1;i++){
                numAvg =+  dataPoints[j];

            }
        }

        double average = numAvg / dataPoints.length;
        System.out.println();
        System.out.println("The average of the array is "+ average);

        Scanner in = new  Scanner(System.in);
        rangeInt = SafeInput.getRangedInt(in,"A value in the array:  ");

        int numCount = 0;
        for(int j=0;j<rangeInt;j++){
            if(dataPoints[j] == rangeInt){
                numCount++;
            }
        }
        System.out.println("Your value appears "+ numCount + "  times.");
        intPosition = SafeInput.getRangedInt(in,"Choose a value in the array:  ");
        for(int j=1;j<intPosition;j++){
            if(dataPoints[j] == intPosition){
                System.out.printf("Your value was found at "+ j);
                break;
            }
        }
        int numMin = dataPoints[0];
        int numMax = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < numMin) {
                numMin = dataPoints[i];
            }
            if (dataPoints[i] > numMax) {
                numMax = dataPoints[i];
        }

        System.out.println("Min value in the array: " + numMin);
        System.out.println("Max value in the array: " + numMax);
            System.out.println("Average of dataPoints is: " + SafeInput.getAverage(dataPoints));







    }


    }
}