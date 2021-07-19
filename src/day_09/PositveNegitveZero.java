package day_09;

public class PositveNegitveZero {

    public static void main(String[] args) {

        // if you only need to create two conditional statement go with if and else... if more than two go with multibranch if.
        int number = 100;

        if (number > 0 ){
            System.out.println(number + " Is positive");
        }else if (number < 0){
            System.out.println(number + " Is negitve");
        }else{
            System.out.println(number + " Is Zero");
        }

        System.out.println("_________________________");

        if (number > 0){
            System.out.println(number + " Is positve");
        }
        if (number < 0){
            System.out.println(" Is negative");
        }else{
            System.out.println(" Is zero");
        }

    }
}
