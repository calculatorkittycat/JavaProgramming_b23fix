package day_06;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println("Addition: " + 2 + 3 );
        System.out.println("Addition: " + (2 + 3 ) );

        System.out.println("____________________");

        int a = 10;
        int b = 2;

        //putting in ( ) is called grouping
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + a*b);
        //Grouping is not needed above because multiplication has a higher precedence than plus
        System.out.println("Division: " + a/b);
        //Grouping is not needed above because division has had higher precedence than plus
        System.out.println("Remainder: " + a%b);
        //Grouping is not needed above because remainder has a higher precedence than plus

        //

    }
}
