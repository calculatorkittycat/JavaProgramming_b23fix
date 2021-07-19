package day_07;

public class RelationalOperators {

    public static void main(String[] args) {
        //there are only two possible outcomes from Rational Operators: TRUE OR FALSE

        // > greater than
        // >= greater than or equal to
        System.out.println( 10 > 11); //false

        System.out.println(10 >= 10); //True

        System.out.println(11 >= 9); //true

        System.out.println(20 >= 200); // false

        // < , <=
        System.out.println(1000 < 100); //false
        System.out.println(1000< 10000);//true
        System.out.println(10000 <= 1000);//false
        System.out.println(1000 <= 10000); //true

        // ==, !=
        System.out.println(5 == 6); //false
        System.out.println(5 != 6); //true

        // it also works for text

        System.out.println("Java" == "java"); // false
        System.out.println("Java" != "java"); //true



    }
}
