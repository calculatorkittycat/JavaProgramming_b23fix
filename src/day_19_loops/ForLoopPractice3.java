package day_19_loops;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {


        /*
        2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

         */
        for (int i = 1; i <= 8 ; i++) {
            System.out.println("\t\t******"); // if there is only one statement in the for loop you do not need open and closing curly brace

        }
        System.out.println("____________________________________________");
        /*
        3. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *
         */
        System.out.println("********");
        for (int i = 0; i < 8; i++) {
            System.out.println("*      *");

        }
        System.out.println("********");

        System.out.println("____________________________________________");
        /*
         write a program that can calculate the sum of all numbers between 1 to 100
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum+= i;

        }
        System.out.println(sum
        );
    }
}
