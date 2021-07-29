package OfficeHours_07_28_2021;

import java.util.Scanner;

public class WrapperClassIntro {

    public static void main(String[] args) {

        //Autoboxing
        int b = 30;
        Integer a = b;

        //Unboxing
        Integer num1 = Integer.valueOf(300);
        int num2 = num1;

        // parseInt();,parseDouble() ect vs value of
        Scanner sc = new Scanner(System.in);
        String str = new String("test");

        Integer num = new Integer(300);//same
        Integer num3=Integer.valueOf(300);//same

    int i = Integer.parseInt("123");//turns string into a primitive

        //WrapperClassMethods

        Integer.max(5,4);//returns 5
        Integer.min(6,7);//returns 6

        System.out.println(Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Integer.compare(7,9) = " + Integer.compare(7, 9));
        System.out.println("Integer.compare(9,7) = " + Integer.compare(9, 7));




    }
}
