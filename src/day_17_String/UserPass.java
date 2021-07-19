package day_17_String;

import java.util.Scanner;

public class UserPass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String correctUserName = "Cybertek@gmail.com";
        String correctPassword = "Cybertek123";

        System.out.println("Enter User Name");
        String userName = scan.next();

        System.out.println("Enter Your Password");
        String password = scan.next();

        boolean canLogIn = userName.equalsIgnoreCase(correctUserName) && password.equals(correctPassword);

        if(canLogIn){
            System.out.println("Logged in Successfully");

        }else{
            System.out.println("Invalid username of password");
        }
        scan.close();





        /*
         Ask the user to enter username and password, and username can be typed either in lowercase or uppercase. Still, the password must be exact in order to log in. write a program to check if the user entered username & passwords match with the saved username & password in the database. If it's, then print "Logged in successfully". Otherwise, print "Invalid username or password."
        Assume that your username & password in the database are:
                                Cybertek@gmail.com
                                Cybertek123
        Ex:
            username: CYBERTEK@Gmail.com
            password: Cybertek123
            output:
                Logged in successfully
         */
    }
}
