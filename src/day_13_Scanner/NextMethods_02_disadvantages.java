package day_13_Scanner;

import java.util.Scanner;

public class NextMethods_02_disadvantages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();//clears scanners memory of everything in this case the enter strike

        System.out.println("Enter your job title");
        String jobTitle = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("jobTitle = " + jobTitle);
    }
}
