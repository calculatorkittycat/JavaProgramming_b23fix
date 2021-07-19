package Day_12_Scanner;


import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

        int radius = input.nextInt();

        System.out.println(radius * radius * 3.14);
    }
}
