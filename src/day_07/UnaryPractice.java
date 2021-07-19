package day_07;

public class UnaryPractice {

    public static void main(String[] args) {


        int a = 100; //a=100+1=101+102-1=101-1=100
        int b = -a++ + ++a - a-- * a-- % 2;
        //  b = -100 + 102 - 102 * 101 % 2;
        //  b = -100 + 102 - 10302 % 2;
        //  b = -100 + 102 - 0
        //  b = 2;

        System.out.println(a);
        System.out.println(b);

        int c= 10;
        System.out.println(c--);
        System.out.println("c = " + c);

        //post increment changes the value in the next step. whatever that may be even if it is a plus symbol in an
        //equation like 100-- + 1 = 100





        /*
        2. manually calculate the following code fragments:

          1. int a = 100;
             int b = -a++ + ++a - a-- * a-- % 2

         */
    }
}
