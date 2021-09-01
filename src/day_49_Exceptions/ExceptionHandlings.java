package day_49_Exceptions;

import Day_46_Inheritance.shapeTask.Circle;
import day_48_review.cybertekTask.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlings {

    public static void main(String[] args) {
/*
        String str = "Cybertek";

        try {
            System.out.println(str.charAt(200));
            System.out.println("Try block");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String index out of bound exception occurred BABY!");
        }


        str += " School";

        System.out.println(str);


        System.out.println("_____________");


        try{
            System.out.println(9/0);
        }catch (IllegalArgumentException e){
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e){
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (RuntimeException e){
           // System.out.println(e.getMessage());
            e.printStackTrace(); //runs all code then gives exception code/message! //only gets executed after all the code fragments have been executed
        }

        System.out.println("Test completed");

        System.out.println("_____________");

        try {//plan a
            System.out.println(new Scanner(System.in).nextInt() );//expecting int, but give a string
        }catch (ArithmeticException e){//plan b
            e.printStackTrace();
        }catch (NumberFormatException e){//plan c
            e.printStackTrace();
        }catch (IllegalArgumentException e){//pland
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }



        System.out.println("test completed");

        System.out.println("_____________");
*/
        Circle circle1 = null;

        try{
            circle1.getRadius();
        }catch (RuntimeException e){//this code fragment makes sure the next code can be executed while printing the exception
            e.printStackTrace();
        }

        System.out.println("Completed");











    }
}
