package day_30_Review;

import java.util.Arrays;

public class ArraysReview {

    public static void main(String[] args) {
/*
        String item = "Eggs",
                item2= "Milk",
                item3= "Apples",
                item4 = "Chiclen",
                item5 = "Peppers";
                */

        String[] items = new String[10];
        items[2] = "Mielk";
        items[3] = "Tacos";
        //items[10] = "Grape"; // out of bounds

        System.out.println(Arrays.toString(items));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i <= numbers.length-1; i++) {
            System.out.println(numbers[i]);//call the array variable and the loop name i
        }

        System.out.println("______________________________________________________");

        int[] nums = {10, 20, 30, 40, 50};
        int[] result = new int[nums.length];

        for (int i = nums.length-1, j =0; i >= 0 ; i--, j++) {//gets all the elements from the array in reverse order
           result[j] = nums[i];
        }

        System.out.println(Arrays.toString(result));

        System.out.println("______________________________________________________");

        String[] group1 ={"Sophie", "Feruza", "Ekaterina"};
        String[] group2 ={"Shazia", "Bilguun", "Danka", "Mucahit"};

        String[] group3 = new String[group1.length + group2.length];

        int k = 0;
        for(int i = 0; i <= group1.length-1; i++, k++){
            group3[k] = group1[i];
        }

        for(int j = 0; j <= group2.length-1; j++, k++){
           group3[k] = group1[j];
        }

        System.out.println(Arrays.toString(group3));


    }
}
