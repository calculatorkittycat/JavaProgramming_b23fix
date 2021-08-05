package day_40_Custom_Class_Statics;

import java.util.Scanner;

public class AddressObjects {

    public static void main(String[] args) {
        Address address = new Address();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter building number.");
        String building = scan.next();

        scan.nextLine();

        System.out.println("Enter street");
        String street = scan.nextLine();

        System.out.println("Enter city");
        String city = scan.nextLine();

        System.out.println("Enter state");
        String state = scan.nextLine();

        System.out.println("Enter Zip");
        int zipcode = scan.nextInt();


    }
}
