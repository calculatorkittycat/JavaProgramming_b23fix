package day_17_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        String gmail = "Cybertek@yahoo.com";
/*
        String domain = gmail.substring( gmail.indexOf("@"));

        boolean isValidGmail = domain.equals("@gmail.com");
        */
        boolean isValidGmail = gmail.endsWith(("gmail.com"));

        System.out.println("isValidGmail = " + isValidGmail);

        System.out.println("_____________________________________");

        String url = "www.amazon.com";

        boolean isValidUrl = url.startsWith("www.") && (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov"));

        System.out.println("isValidUrl = " + isValidUrl);


        System.out.println("___________________________________________");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        boolean endsWithLy = word.substring( word. length()-2).equals("ly");
        boolean endWithLy2 = word.endsWith("ly");

        if(endsWithLy){
            System.out.println("Really?");
        }else{
            System.out.println("Nevermind");
        }
        scan.close();

    }
}
