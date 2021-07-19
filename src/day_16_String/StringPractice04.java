package day_16_String;

import java.util.Scanner;

public class StringPractice04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 words");

        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        if(word1.length() == word2.length() && word1.length() == word3.length()){
            System.out.println("All Words Same Length");

        }else if (word1.length() != word2.length() && word2.length() != word3.length() && word1.length() != word3.length());


    }

}
