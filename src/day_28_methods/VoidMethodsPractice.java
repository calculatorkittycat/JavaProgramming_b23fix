package day_28_methods;

import java.util.Scanner;

public class VoidMethodsPractice {

    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
      //  printOddNumbers(scan.nextInt(),scan.nextInt());
        printOddNumbers(1,100);

        printEvenNumbers(100,200);

        calculateAge(1990, 2021);
        System.out.println("_____________________________");
        eligibleToVote(25,true);
        calculator(100,'-',200);
    }


    public static void printOddNumbers(int from, int to){

        for (int i = from; i < to ; i++) {
            if ( i % 2 !=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }

    public static void printEvenNumbers(int from, int to){

    for (int i = from; i < to ; i++) {
        if(i%2 ==0){
            System.out.print(i+" ");
        }
    }
    System.out.println();
}

    public static void calculateAge( int birthYear, int currentYear){
        System.out.println("Your age is "+ (currentYear - birthYear));



    }

    public static void eligibleToVote (int age, boolean isUsCitizen) {

        if (age >= 21 && isUsCitizen) {
        System.out.println("You are eligible to vote");
        }else{
            System.out.println("NO!");
        }

    }

    public static void calculator (int num1, char operator, int num2){

        switch (operator){
            case '-':
                System.out.println(num1+" "+operator+" "+num2+" "+"Subtraction"+ (num1 - num2));
                break;

            case '+':
                System.out.println("Addition"+ (num1 + num2));
                break;
            case '*':
                System.out.println("Multiplication"+ (num1 * num2));
                break;
            case '/':
                System.out.println("Division"+ (num1 / num2));
                break;
            case '%':
                System.out.println("Remainder"+ (num1 % num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }

}