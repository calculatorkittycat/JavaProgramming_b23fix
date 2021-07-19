package Day_12_Scanner;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER WIDTH");
        int width = scan.nextInt();

        System.out.println("ENTER LENGTH");
        int length = scan.nextInt();

        int area = length * width;
        int perimeter = (width + length) * 2;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
