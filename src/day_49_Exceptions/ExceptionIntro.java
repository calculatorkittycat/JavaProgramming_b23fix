package day_49_Exceptions;

import java.io.FileInputStream;

public class ExceptionIntro {

    public static void main(String[] args)  {

        int[] arr = {1,2,3};

       // System.out.println(arr[4]);
       // System.out.println(100/0);
        System.out.println("Hello");


        System.out.println("_______________");

        //checked exceptions occur during compile time
        //checked exceptions are known as unwanted event
        //uncheck exceptions occur during runtime

        //unchecked, shows no red line
        //checked shows red line under code
        try {
            Thread.sleep(3000); //before running thread, will pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //FileInputStream file = new FileInputStream("")

        System.out.println("Hello Robinson");

    }
}
