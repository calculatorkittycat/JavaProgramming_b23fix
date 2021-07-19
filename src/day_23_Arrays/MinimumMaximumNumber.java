package day_23_Arrays;

public class MinimumMaximumNumber {
    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 400, 50, 0, -1};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <= numbers.length-1; i++) {

            int each = numbers[i]; // each 10 , 5 , 4 ,400, 50, 0, -1

            if (each > max) {// if any greater number has occurred
                max = each;
            }
            if (each < min) {
                min = each;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
