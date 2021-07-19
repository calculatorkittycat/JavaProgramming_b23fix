package day_05_ArithmeticOperators;

public class ArithmeticalOperatorPractice {

    public static void main(String[] args) {


        int number = 300;
        int number2 = 567;

        boolean isEvenlyDivisibleBy3 = number%3 == 0;
        boolean isEvenlyDivisibleBy4 = number%4 == 0;
        boolean isEvenlyDivisibleBy5 = number%5 == 0;

        // if the remainder of number/5 is zero, then it is even

        System.out.println(number + " is evenly divisible by 3 " + isEvenlyDivisibleBy3);

        System.out.println( number2 + " is evenly divisible by 3 " + isEvenlyDivisibleBy3);

        System.out.println(number + " is evenly divisible by 4 " + isEvenlyDivisibleBy4);




    }
}
