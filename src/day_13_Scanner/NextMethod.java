package day_13_Scanner;

import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next(); //only takes the first word


        System.out.println("Enter your last name");
        String lastName = scan.next(); // only takes the first word

        String fullName = firstName + " " + lastName;

        System.out.println("fullName = " + fullName);

        System.out.println("Enter Your Address");
        String address = scan.next();

        System.out.println("address = " + address);

        String gender = scan.next();
        String state = scan.next();
        String city = scan.next();

        System.out.println("gender = " + gender);
        System.out.println("state = " + state);
        System.out.println("city = " + city);
    }
}
