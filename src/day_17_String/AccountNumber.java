package day_17_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number:");
        String account = scan.next();
        char firstChar = account.charAt(0);
        String result = "";

        switch (firstChar){
            case '2': //if the first character of account is 2
                if(account.length() == 7){
                    result ="Valid Account";
                }else{//if the length is not equal to 7
                    result ="Invalid: should be seven characters long";
                }
                break;
            case '5':
                if(account.length() == 10){//if the length is euqal to 10
                    result ="Valid Account";
                }else{//if the length of the account is not 10
                    result ="Invalid: should be 10 characters long";
                }
                break;

            default:
                result ="Invalid Account";
                System.out.println(result);

        }
scan.close();


/*
        if(account.length() == 7 || account.length() == 10){//if account is 7 or 10  then continue the multibranch if ELSE sout invalid
            if(account.charAt(0) == '2'&& account.length() == 7){// If the first character is 2 and has seven characters
                System.out.println("Valid Account");
            } else if(account.charAt(0) == '5' && account.length() == 10){//if the first character is 5 and has 10 characters
                System.out.println("valid account");
            }else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid");
        }

*/
        /*
        1.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”
         */
    }
}
