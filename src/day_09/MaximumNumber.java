package day_09;

public class MaximumNumber {

    public static void main(String[] args) {


        /*
        1. write a program that can print out the maximum number between two different numbers
            Ex:
                num1 = 20;
                num2 = 30;

            output:
                    30 is the maximum number
         */

        int num1 = 20;
        int num2 = 30;

        if (num1 > num2) {
            System.out.println(num1 + " is maximum");
        }

        if (num1 < num2) {
            System.out.println(num2 + " is maximum");
        }



    }
}
