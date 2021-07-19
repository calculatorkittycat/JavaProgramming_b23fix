package day_19_loops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; //any user entered number will be less than 2147483647

        for (int i = 1; i < 5; i++) {

            System.out.println("Enter a number");
            int n = scan.nextInt(); //100, 300, 50, 400, 5

            if (n < min){
                min = n;// will only replace n value if the user entered number is smaller
            }
            
        }
        System.out.println("min = " + min);
    }
}
