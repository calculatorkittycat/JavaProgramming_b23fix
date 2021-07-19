package day_23_Arrays;

import java.util.Scanner;

public class days {

    public static void main(String[] args) {

        String[] days ={"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
//               index    0                                         6
        System.out.println("Enter a number");
        int n = new Scanner(System.in).nextInt();

        System.out.println(days[n-1]);
    }
}
