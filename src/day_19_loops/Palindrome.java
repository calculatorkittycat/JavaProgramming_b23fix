package day_19_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        //verify if word is a palindrome
        System.out.println("Enter a palindrome");
        String word = new Scanner(System.in).next();

        String reverseWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }


        boolean isPalindrome = word.equalsIgnoreCase(reverseWord);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
