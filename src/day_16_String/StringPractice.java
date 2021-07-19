package day_16_String;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String:");
        String word = scan.next();

        String result = ( word.length() ==0)? "String is empty"
                :(word.length()>3)?  word.substring( word.length()-3)
                : word;

        System.out.println(result);
        scan.close();
    }
}
