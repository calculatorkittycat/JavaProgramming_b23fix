package day_13_Scanner;

import java.util.Scanner;

public class ShippingInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Eneter your building number");
        String buildingNumber = scan.next();

        System.out.println("Enter your street address");
        String streetAddress = scan.next();

        scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        String fullAddress = (fullName + "\n" + buildingNumber +  "\n" +
                cityName + ", " +state+" " + zipCode);

        System.out.println(fullAddress);
    }
}
/*
building number
street address
city name
state
zip code
full name

____________
print the shipping info
ex:
    aysu Ahmadil
    7925 jones branch drive
    McLean, VA
    98020
 */
