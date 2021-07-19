package day_13_Scanner;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("You are full time: ");
        boolean isFullTime = input.nextBoolean();

        System.out.println("You are an adult: ");
        boolean adult = input.nextBoolean();

        System.out.println("you are married");
        boolean isMarried = input.nextBoolean();

        System.out.println("isFullTime = " + isFullTime);
        System.out.println("adult = " + adult);
        System.out.println("isMarried = " + isMarried);




    }
}
