package day_32;

public class WarmupTask1 {


    public static void main(String[] args) {
        
        int sum1 = sumOf2numbers(10, 20);
        System.out.println("sum1 = " + sum1);
        int sum2 = sumOf3numbers(100,200,300);
        System.out.println("sum2 = " + sum2);
        int sum3 = sumOf4numbers(100,200,450,800);
        System.out.println("sum3 = " + sum3);

        System.out.println("_______________________________________");

        int r1 = sum(10,12);
        System.out.println("r1 = " + r1);
        int r2 = sum(10,12,30);
        System.out.println("r2 = " + r2);
        int r3 = sum(10,20,30,40);
        System.out.println("r3 = " + r3);

        System.out.println("________________________________________");
        double l1 = sum(33.7,45.5);
        System.out.println("l1 = " + l1);
        double l2 = sum(42.1,52.6,76.1);
        System.out.println("l2 = " + l2);
        double l3 = sum(32.3,62.3, 54.2, 49.7);
        System.out.println("l3 = " + l3);
    }


    public static int sumOf2numbers(int a, int b) {
        return a + b;
    }

    public static int sumOf3numbers(int a, int b,int c) {
        return a + b +c;
    }

    public static int sumOf4numbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //______________________________________method overloading......................... method name can be same. datatype or # of parameters must be different

    public static int sum(int a, int b) { return a+b; }

    public static int sum(int a, int b, int c) { return a+b+c; }

    public static int sum(int a, int b, int c , int d)//{ return a+b+c+d; }
    { return sum ( sum (a,b) , sum (c,d) ); }//this is just a different way of finding sums

    //______________________________________double......................................
    public static double sum (double a, double b) {return a+b;}

    public static double sum ( double a, double b, double c ) {return  a+b+c;}

    public static double sum ( double a, double b, double c, double d) {return a+b+c+d;}




}