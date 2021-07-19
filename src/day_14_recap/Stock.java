package day_14_recap;

import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many total share do you have");
        int totalShares = scan.nextInt();

        if (totalShares > 0) {
            System.out.println("How much is your total value in the stock market?");
            double totalValue = scan.nextDouble();

            scan.nextLine();//This clears the scanners memory before using the scan.nextLine
            System.out.println("What is the name of the company?");
            String companyName = scan.nextLine();

        /*}else{
            System.out.println("***INVALID***");
        }
        System.out.println("Your total stock market holding is $" + totalValue +
                " which is made up of " +totalShares + " shares. " + companyName +  " is your company holdings");



        scan.close();

         */
        }
    }
}
