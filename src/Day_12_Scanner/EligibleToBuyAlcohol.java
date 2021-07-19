package Day_12_Scanner;

import java.util.Scanner;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = input.nextInt();

        if(age >=21) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }


    }
}
