package day_13_Scanner;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter the Number of Cents");

        int cents = input.nextInt();

        int dollars = cents / 100;
        int remainder = cents % 100;


        if (cents >= 0) { //if input is valid
            if (remainder == 0) {
                System.out.println(cents + " is equal to " + dollars + " dollars");
            } else {
                System.out.println(cents + " is equal to " + dollars + " dollars and " + remainder + " cents");
            }
        }else{ //if the input is not valid
            System.err.println("ERROR");
        }



    }
}
