package day_13_Scanner;

import java.util.Scanner;

public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter you Salary");
        int salary = scan.nextInt();

        System.out.println("Enter your Gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("salary = " + salary);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);



    }
}
/*
1.salary (nextInt)
2.gender(next
3.full name
 */