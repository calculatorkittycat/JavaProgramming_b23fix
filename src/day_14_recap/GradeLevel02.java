package day_14_recap;

import java.util.Scanner;

public class GradeLevel02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade number");
        byte number = scan.nextByte();
        String gradeLevel= "";

        //byte, short, long, int, double, float, char, boolean
        //non primitive -- String
        //long, double, short, and boolean are not excepted in switch statements

        switch (number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                gradeLevel = "elementary";
                break;

            case 6:
            case 7:
            case 8:
                gradeLevel = "middle school";
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                gradeLevel = "high school";
                break;

            case 13:
            case 14:
            case 15:
            case 16:
                gradeLevel = " college";
                break;

            case 17:
            case 18:
                gradeLevel = "grad school";
                break;
            default:
                System.out.println("FAIL");


        }
        System.out.println("gradeLevel = " + gradeLevel);
    }
}
