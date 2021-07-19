package day_23_Arrays;

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 5 ; i++) {
            System.out.println("********************");

        }
        System.out.println("______________________");
//       NESTED LOOP
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 20 ; i++) {
                System.out.print("*");
        }
            System.out.println();//appends new lines after printing each 20 *'s

        }
        System.out.println("____________________________________________");

        for (int j = 1; j <= 8; j++) {//j: number of lines
            for (int i = 1; i <= j ; i++) { //: number of * in each line
                System.out.print("*");

            }
            System.out.println();//appends new line


        }
    }
}
