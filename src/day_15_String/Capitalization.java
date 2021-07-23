package day_15_String;


import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your first name");

        String firstName = scan.nextLine().trim();
            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("Enter your last name");
        String lastname = scan.nextLine().trim();
        lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();

String fullname = firstName + " " +lastname;

        System.out.println(fullname);


        /*
        ask the user to enter their first name
        1.Make sure there is no white space
        2.Make sure the first char is upper case
         */
    }
}
