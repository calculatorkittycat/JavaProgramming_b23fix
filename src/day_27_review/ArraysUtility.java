package day_27_review;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

     int[] nums ={1,2,3,};

     int[] number = Arrays.copyOf(nums, 10); //{1, 2, 3, 0, 0, 0, 0, 0, 0, 0}

        System.out.println(Arrays.toString(number));

        System.out.println("____________________________");

        int[] arr1 ={1,2,3,4};
        int[] arr2 = {5,6,7,8,9};

        int [] arr3 = Arrays.copyOf(arr1, arr1.length+arr2.length);

        System.out.println(Arrays.toString(arr3));
        int i = arr1.length;
        for ( int each :  arr2 ){
            arr3[i++] = each;
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("____________________________");
        int[] data = {10,20,30,40,50,60,70,80,90,100};
        int[] someData = Arrays.copyOfRange(data, 2, 6);

        System.out.println(Arrays.toString(someData));

        System.out.println("____________________________");

        char[] characters = new char[26];
        int j = 0;
        for (char k = 'A'; k <= 'Z'; k++ ){
            characters[j++] =k;
        }

        System.out.println(Arrays.toString(characters));

        char[] firstTenLetters = Arrays.copyOfRange(characters, 0, 9+1);

        System.out.println(Arrays.toString(firstTenLetters));

        char[] lastTenLetters = Arrays.copyOfRange(characters, characters.length-10, characters.length);

        System.out.println(Arrays.toString(lastTenLetters));

    }
}