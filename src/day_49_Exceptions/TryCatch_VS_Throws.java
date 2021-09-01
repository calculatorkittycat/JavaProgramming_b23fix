package day_49_Exceptions;

import day_42_CustomClassConstructor.warmUpTasks.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch_VS_Throws {

    public static void main(String[] args) {
        //only way to handle unchecked exception is with the try catch


        Employee employee1 = null; //not an object, is null

        try{
            System.out.println(employee1.salary);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Step 1"); // this will still print thanks to the e.printStackTrace.



    }


    public static void method1() throws FileNotFoundException {

        new FileInputStream("");//checked exception


    }



    public static void method2()  {


        try {
            new FileInputStream("");//checked exception
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }



    public static void test1() { // if you call this method later you will not get this exception again because try catch is used
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void test2() throws FileNotFoundException {// if this method will not be called anywhere else use throws
        method1();
    }

}
//TWO ways to deal with checked exception, throws keyword and try catch
// Throws keyword is cleaner and faster but, it does not handle the exception, it is declairing that the method is the exception
// so that it will be temp fixed. Throws keyword only deals with the exception once! in one place. in the method.
//use throw keyword if you are not going to call the method anywhere else.
//use try catch if you are going to call the method anywhere else
