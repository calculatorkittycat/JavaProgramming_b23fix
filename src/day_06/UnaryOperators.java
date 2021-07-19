package day_06;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 100;

        ++a;
        //increase value by 1
        //preincrement ++a;
        System.out.println("a = " + a);

        int b = 100;

        --b;
        //decrease value by 1
        System.out.println("b = " + b);

        System.out.println("__________________");

        int x = 10;

        //System.out.println( ++x); //11 pre: change the value by one immediately 
        System.out.println( x++); // 10 post: first passes the current value, then change the current value by 1.
        System.out.println("x = " + x);

        System.out.println("__________________");
        
        int n1 =50;
        int n2 = n1++;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int a1 = 100;
        int a2 = ++a1;

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        System.out.println("__________________");

        int r = 200;
        System.out.println( r++); //increase by 1 delayed
        System.out.println("r = " + r);

        int p = 200;
        System.out.println(++p); //preincrement Prints immediately
        System.out.println("p = " + p);

        System.out.println("__________________");


        int y = 100;
        int result = y++ + 1;

        System.out.println("y = " + y);
        System.out.println("result = " + result);

        int z = 100;
        int result2 = ++z + 1;
        System.out.println("z = " + z);
        System.out.println("result2 = " + result2);
        







    }
}
