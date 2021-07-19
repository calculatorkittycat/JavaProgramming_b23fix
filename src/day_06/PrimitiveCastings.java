package day_06;

import java.text.DecimalFormat;

public class PrimitiveCastings {

    public static void main(String[] args) {

        //casting means converting one primitive type to another
//	Primitive Casting: Converting one primitice type to another
//
//		
//
//		Larger primitive types cannot be assigned to smaller types
//		Byte can be assigned to float, long, int, short, byte
//		But double cannot be assigned to float, long, int, short or byte
//
//		2 types:
//			implicit casting: casting smaller type to larger. automatically done
//
//				double a = 3
//				       a == 3.0
//				       (This is an example of implicit casting)
//
//				long l = 10;
//					 l ==> 10l;
//
//			explicit casting: casting larger to smaller. manually done
//
//				double a = 3;
//
//				int b = (short)a;
        // double > float > long > int > short > byte
        
        
        
        byte a = 10;
        long b = a; //implicit casting. automatically done
        
        double d = 10.0;
        int f = (int)(long)d ; // explicit casting

        System.out.println("____________________");
        
        //larger to smaller is known as explicit casting
        long n = 100;
        short m = (short) n;

        System.out.println("____________________");
        
        float q = 2.5f;
        int u = (int) q;
        
        long r = (long) q;
        
        short s = (short) q;


        System.out.println( (double)2.5f );
        System.out.println( (double) 10l);
        
        int w = 129;
        byte z = (byte) w;
        System.out.println("z = " + z);
        
        
        int e = 70000;
        short g = (short)e;

        System.out.println("g = " + g);

        // if the number is out of the rang you tried to cast you will get an accurate number

        System.out.println("__________________");

        double num1 = 1000.00;
        int num2 = (int)num1;

        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        System.out.println("__________________");
        System.out.println( (int)100.23456);

        DecimalFormat df = new DecimalFormat( "0.00)");
        System.out.println( df.format(1.093209202));


        
        
    }
}
