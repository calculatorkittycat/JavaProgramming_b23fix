package day_19_loops;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        //ask user to enter a number 5 times, then return the maximum number

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; //whatever user enters it will be larger than -2147483648// smallest int in java
        //1, 5 five will remain max becase the following ints are not larger
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt(); //1, 5 ,4 ,2, 3

            if(n > max){  //this checks if the user entered number is greater than the current maximum number that has been entered
                max = n; // it will only replace the max variable when the next number entered is greater than the max value
            }

        }
        System.out.println("max = " + max);

scan.close();
    }
}
