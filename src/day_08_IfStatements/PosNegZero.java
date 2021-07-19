package day_08_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int number = 0;


        boolean positive = number > 0;
        boolean negatigve = number < 0;
        boolean zero = !positive && !negatigve ;

        if (positive){ //if the number is postive
            System.out.println(number + " is a postive number.");
        }

        if (negatigve) {//if the number is negative
            System.out.println(number + " is a negative number.");

        }

        if (zero) { //if th number is zero
            System.out.println(number + " is zero.");
        }



    }
}
