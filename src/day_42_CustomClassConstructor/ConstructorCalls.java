package day_42_CustomClassConstructor;

public class ConstructorCalls {

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("Method 2");
    }

    public static void method3(){
        //ConstructorCalls();
        // this();
    }

    public ConstructorCalls(){
        method1();
        method2();
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this(); //calling no-arg constructor
        System.out.println("Constructor with int arg");
    }


    public static void main(String[] args) {

        method2();
        System.out.println("____________________________________");

        new ConstructorCalls();

        System.out.println("____________________________________");

        new ConstructorCalls(10);
    }



}
