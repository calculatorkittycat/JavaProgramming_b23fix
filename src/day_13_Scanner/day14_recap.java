package day_13_Scanner;

import java.util.Scanner;

public class day14_recap {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Product Name");
        String productName = scan.nextLine();

        System.out.println("Enter The Price");
        double price = scan.nextDouble();

        System.out.println("Enter The Quantity");
        int quantity = scan.nextInt();

        scan.nextLine();
        System.out.println("What Is Your First Name?");
        String firstName = scan.nextLine();



        scan.close();



        double totalPrice = price * quantity;

        System.out.println(firstName + " your order for " + quantity + " " + productName + " at " + price + " has been placed." );
        System.out.println("The total price is: " + totalPrice);

    }
}
