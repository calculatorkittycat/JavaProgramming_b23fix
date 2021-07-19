package Day_12_Scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate");

       double rate = input.nextDouble();

        System.out.println("Enter the amount of hours you work in a week");

        int hours = input.nextInt();

        System.out.println("Enter the number of weeks you work in a year");

        int weeks = input.nextInt();

        System.out.println("Your yearly income is : " + rate * hours * weeks);

    }
}

/*
ask the user:
salary
hours worked in a week
how many weeks worked in a year

 */
