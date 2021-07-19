package day_05_ArithmeticOperators;

public class AritheticOperators {

    public static void main(String[] args) {

        System.out.println(25/2 );
        //with decimal notice differnce
        System.out.println(25/2.0);
        //or the denominator can be decimal
        System.out.println(25.0/2);
        //if you dont want to add the .0 there is another way
        System.out.println(25d/2);
        //it doesnt matter which side of the equation it is added to
        System.out.println(25/2d);

        int a = 100/3 ;
        double b = 100/3;
        double c = 100.0/3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("___________________");

        //remainders

        int n1 = 100;
        int n2 = 40;

        System.out.println(n1%n2);



    }
}
