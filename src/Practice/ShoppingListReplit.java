package Practice;

import java.util.Scanner;

public class ShoppingListReplit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();
        double price1 = scan.nextDouble();
        System.out.println("Enter Item2 and its price:");
        String item2 = scan.next();
        double price2 = scan.nextDouble();
        System.out.println("Enter Item3 and its price:");
        String item3 = scan.next();
        double price3 = scan.nextDouble();

        double totalPrice = price1 + price2 + price3;

        System.out.println("Item 1: "+ item1 + " " + price1 + ", " + "Item 2: " + item2 + " " + price2 + ", "
                + "Item 3: " + item3 + " " + price3);
        System.out.println("Total price: " + totalPrice);

    }
}
