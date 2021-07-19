package OfficeHours03_06_2021;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;
        int count = 0;

        do{
            if(count == 3){
                System.out.println("Account Locked: Too many attempts");
                System.exit(0);
            }
            System.out.println("Enter your pin");
            pinCode= input.nextInt();
            count++;

        }while(pinCode != secretPinCode);

        System.out.println("Your Personal identification number is valid");

    }
}
