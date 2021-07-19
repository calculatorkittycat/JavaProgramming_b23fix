package day_27_review;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int [] array = new int[2]; //2 is size of the array
        array[0] = 10;// can store two elements
        array[1] = 20;// can store two elements
        array = new int[4]; // this changes the size of the array to four, but this will clear the previous array values of 10 and 20
        array[2] = 30;
        array[3] = 40;

        System.out.println(Arrays.toString(array));//prints entire array

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(numbers.length);// prints total number of indexes
        System.out.println(numbers[0]);//prints first index number
        System.out.println(numbers.length-1);//prints last index number

        for (int i = 0; i <= numbers.length-1; i++) {
            System.out.print(numbers[i]+" ");//prints all indexes in array
        }



    }
}
