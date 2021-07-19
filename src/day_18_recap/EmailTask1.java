package day_18_recap;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        String email = new Scanner(System.in).next();
        int indexOf_ = email.indexOf("_");//returns the index number of the underscore from the email address
        int indexOfAt = email.indexOf("@");//returns the index number of the @ symbol in the email address

        String firstName = email.substring(0, indexOf_); //This line creates a SUB STRING using the next from index 0 all the way to the underscore!

        String lastName = email.substring(indexOf_ +1, indexOfAt);// creates a sub string from just after the underscore to just before the @ symbol!

        String remaining = email.substring(indexOfAt); // Everything after the @ symbol


        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("remaining = " + remaining);

        String result = lastName+"_" + firstName+remaining;

        System.out.println(result);


        /*
            Assume that email address is constructed by person's first name and followed by an underscore and last name.
            Write a program that can swap first name with last name in the email (Seperated by an underscore).
            If the email doesn't contain an underscore print the given input email.
         */
    }
}
