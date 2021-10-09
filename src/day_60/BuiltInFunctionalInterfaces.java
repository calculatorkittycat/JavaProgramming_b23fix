package day_60;

import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces {

    public static void main(String[] args) {

        //create a function that can can check if the number is even
        Predicate<Integer> isEven = p -> p%2==0?true:false;
        
        boolean r1 = isEven.test(101);
        System.out.println("r1 = " + r1);

        //create a function that can check if a string is a palindrome

    }
}
