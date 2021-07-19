package day_14_recap;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your grade number");
        byte number = scan.nextByte();
        String gradeLevel= "";


if (number >1 && number <= 18){

    gradeLevel = (number >= 5)? "Elementary School" :(number <= 8)? "Middle School"
            :(number <=12)? "High school" :(number <= 16)? "college" : "grad school" ;

}else{
    gradeLevel="invalid";
}

        System.out.println("gradeLevel = " + gradeLevel);

scan.close();
    }
}
