package day_19_loops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println("Enter some words to reverse them");
        String name = new Scanner(System.in).nextLine(); //nextLine allows you to enter a sentence
        //index:       0123

        String reverseName = ""; //navI

        for (int i = name.length()-1; i >= 0; i--) {
           reverseName += (name.charAt(i));
        }
        System.out.println(reverseName);


    }
}
