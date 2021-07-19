package day_22_do_while;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {

        String cUser = "user";
        String cPass = "pass";

        Scanner scan = new Scanner(System.in);
        System.out.println("User Name");
        String u = scan.next();

        System.out.println("Password");
        String p = scan.next();


        if(cUser.equals(u) && cPass.equals(p)){
            System.out.println("Logged in");
        }else{

            for (int i = 1; i <= 3; i++) {
                System.out.println("Incorrect Credentials");
                System.out.println("User Name");
                u = scan.next();
                System.out.println("Password");
                p = scan.next();

                if(cUser.equals(u) && cPass.equals(p)){
                    System.out.println("logged in");
                    break;
                }
                if(i==3);
                System.out.println("too many attempts");
                System.exit(0);
            }

        }
        System.out.println("HELLO CYBERTONK");
scan.close();
    }
}
