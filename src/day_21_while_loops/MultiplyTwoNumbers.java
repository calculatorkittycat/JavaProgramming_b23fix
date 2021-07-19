package day_21_while_loops;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {
        /*
        1. write a program that can multiply two numbers without using * operator
         */

        int a = 5;
        int b = 3;
        if (b < 0){
            b*=-1;//multiplying any negative number by -1 will convert it to a positive number
        }

        int result = 0;

        for (int i = 0; i < b; i++) {
        result += a;
        }
        System.out.println(result);
    }
}
