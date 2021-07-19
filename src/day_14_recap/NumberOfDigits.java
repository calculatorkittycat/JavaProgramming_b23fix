package day_14_recap;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter a number between 1 and 100,000");
        int n = scan.nextInt();

        String result = "";

        if(n >= 1 && n<=999999) {// if the number is valid

        if( n <= 9){
            result = "one digit";
        }else if(n <= 99){
            result = "two digits";
        }else if(n <= 999){
            result = "three digits";
        }else if(n <= 9999){
            result = "four digits";
        }else if(n <= 99999){
            result = "five digits";
        }else if(n <= 999999){
            result = "six digits";

        }

        }else{
            System.out.println("INVALID");
        }
        //turnary conversion
        String result2 = (n >= 1 && n<= 999999)? (n <= 9) ? "1 digit" :( n <= 99) ? " 2 digits"
                :(n <= 999)? " 3 digits" :( n <= 9999)? " 4 digits" :( n <= 99999)? " five digits": " 6 digits"
:"Invalid";

        System.out.println(n+" has" + result);





    }
}
