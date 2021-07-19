package day_19_loops;

import java.util.Scanner;

public class SumOfTenNumbers {
    public static void main(String[] args) {

        /* ask user to enter a number 10 times. find the sum of 10 numbers

         */

        Scanner scan = new Scanner(System.in);


        int result = 0;

        for (int i = 1; i < 10 ; i++) {

            System.out.println("Enter a number");
            result += scan.nextInt();

        }
        System.out.println("result = " + result);


    }
}
