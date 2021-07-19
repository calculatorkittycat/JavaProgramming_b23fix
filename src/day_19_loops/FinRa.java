package day_19_loops;

public class FinRa {
    public static void main(String[] args) {

String result = "";
        for (int i = 1; i < 100; i++) {
            result += (i % 15 == 0 )? "FINRA " :(i % 3 == 0 ) ? "FIN " :(i%5 == 0)? "RA " : i+ " ";




            /*
            if (i % 15 == 0) { //if number is divisible by 3 and 5 at the same time * changed to 15
                System.out.print("finra ");
            } else if (i % 3 == 0) {
                System.out.println("fin ");
            } else if (i % 5 == 0) {
                System.out.println("ra ");
            } else {
                System.out.println(i + " ");
            }

        }

         */
        }
        System.out.println(result);
    }
}
/*
1. Write a method which prints out the numbers from 1 to 100 butfor numbers which are a multiple of both 3 and 5,
 print "FINRA" instead of the number,  for numbers which are a multiple of 3,
  print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
 */
