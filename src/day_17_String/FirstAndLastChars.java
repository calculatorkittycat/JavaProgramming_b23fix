package day_17_String;

import java.util.Scanner;

public class FirstAndLastChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String first = word.substring(0,1);
        String last = word.substring(  word.length()-1);    //to find last char subtract 1 from the length of the string

        if (first.equalsIgnoreCase(last)){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }

scan.close();
    }
}
