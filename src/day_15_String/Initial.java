package day_15_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Initial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR FIRST NAME");
        char f = scan.next().charAt(0);

        System.out.println("ENTER YOUR LAST NAME");
        char l =  scan.next().charAt(0);
/*
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        */
        String initial = f + "." + l;

        System.out.println("initial = " + initial);
        


        /*
        1. First Name
        2. Last Name

        then print the initials

        ex: William
            Shakespear

            initial: W.S.
         */

    }
}
