package day_22_do_while;

import java.util.Scanner;

public class Credintials {
    public static void main(String[] args) {

        String correctUsername = "cybertek";
        String correctPassword = "cybertek12345";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your User Name");
        String u = scan.next();

        System.out.println("Enter Your Password");
        String p = scan.next();

        if(u.equals(correctUsername) && p.equals(correctPassword)){
            System.out.println("Logged in");
        }else{

            for (int i = 0; i < 3; i++) {
                System.out.println("Username or Password is incorrect");
                System.out.println("Enter Your User Name");
                u = scan.next();

                System.out.println("Enter Your Password");
                p = scan.next();

                if(u.equals(correctUsername)&& p.equals(correctPassword)){
                    System.out.println("Logged In");
                    break;
                }
                if(i==3){
                    System.out.println("Too many attempts");
                    System.exit(0);
                }
            }



        }


        System.out.println("Hello Cybertonk");
        scan.close();


    }
}
/*
1. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: cybertek
                    password: cybertek12345

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched,
                the program should allow the user to have three attempts to enter correct credentials
                and if all three attempts are failed, then print "Your account is lucked."
 */