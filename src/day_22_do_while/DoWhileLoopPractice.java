package day_22_do_while;

import java.util.Scanner;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int i = 0;
        do{
            if(i%2==0){
                sumOfEven += i;
            }else{
                sumOfOdd += i;
            }

            i++;
        }while( i <= 10 );

        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);

        System.out.println("___________________________________________");
        Scanner scan = new Scanner(System.in);
        String userName = "John";
        String password = "John123";
        String u = "";
        String p = "";
        do{
            System.out.println("Enter username and password");
            u = scan.next();

            System.out.println("Eneter your password");
             p = scan.next();
        }while( !(u.equals(userName) && p.equals(password)) );//while the credentials are incorrect

        System.out.println("Logged in");


    }
}

