package day_23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        //          user    1                                                                             12
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //          index   0                                                                             11

        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        if(n>1 && n<=12) {
            System.out.println(months[n-1]);
        }else{
            System.out.println("FAIL");
        }





    }
}
