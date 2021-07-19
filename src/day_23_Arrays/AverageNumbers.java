package day_23_Arrays;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int[] numbers = new int[scan.nextInt()];
        int sum = 0;

        for (int i = 0; i <= numbers.length-1 ; i++) {//used for getting the user input and storing it into the array
            System.out.println("enter a number");
            numbers[i] = scan.nextInt();//assigning user input to the indexes of the array
            sum += numbers[i];//returns the sum of the elements in the array
        }
        System.out.println("sum = " + sum);
        double average = (double)sum / numbers.length;
        System.out.println("average = " + average);
scan.close();
    }
}
