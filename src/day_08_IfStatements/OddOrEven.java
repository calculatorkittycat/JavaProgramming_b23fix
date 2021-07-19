package day_08_IfStatements;

public class OddOrEven {

    public static void main(String[] args) {


        int number = 98;

        boolean odd = number%2 != 0 ;

        if (odd){ // if number is odd
            System.out.println(number + " is an odd number");
        }
        if (!odd){
            System.out.println(number + " is an even number");
        }



    }
}
