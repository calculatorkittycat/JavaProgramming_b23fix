package day_16_String;

import java.util.Scanner;

public class StringPractice02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Words");

        String word1 = scan.next();
        String word2 = scan.next();

        if (word1.length() >= 2 && word2.length() >= 2) {
            String result = word1.substring(1) + word2.substring(1);
            System.out.println(result);
        } else {
            System.out.println("Too short");
        }
    }
}
