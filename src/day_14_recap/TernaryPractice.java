package day_14_recap;

import java.util.Scanner;

public class TernaryPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A NUMBER BETWEEN ONE AND SEVEN");
        int n = scan.nextInt();

        String name = (n >= 1 && n <=7)?
                (n == 1)? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday" :(n==5)? "Friday"
                        :(n==6)? "Saturday" : "Sunday"
                : "No Such A day";

        System.out.println("________________________________________________");
        String name2 ="";
        if(n >= 1 && n <=7) {

            switch (n) {
                case 1: name2 = "monday"; break;
                case 2: name2 = "tuesday"; break;
                case 3:name2 = "wednesday"; break;
                case 4:name2 = "thursday"; break;
                case 5:name2 = "firday"; break;
                case 6:name2 = "saturday"; break;
                default:
                    name2 = "sunday";
            }
        }else{
            name2 = "ERROR";
        }
        System.out.println("name2 = " + name2);
    }
}
