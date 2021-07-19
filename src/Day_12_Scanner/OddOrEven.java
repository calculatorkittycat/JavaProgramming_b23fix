package Day_12_Scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Eneter a number");
        int number = scan.nextInt();

        System.out.println( (number%2 !=0)? "Odd" : "Even");

        System.out.println( (number > 0)? "Positive" :(number < 0)? "Negative" : "Zero");
    }
}
