package day_30_Review;

import java.util.Scanner;

public class LoopsReview {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String answer = "";
        int n = 0;


       while(!answer.equals("no")) {// false if the answer is no
            System.out.println("Enter a number");
            n = scan.nextInt();
            System.out.println("Would you like to continue");
            answer = scan.next();

            while( !(answer.equals("yes") || answer.equals("no")) ){
                System.out.println("INVALID FUCKING ANSWER!");
                answer = scan.next();
            }
        }

    }
}
