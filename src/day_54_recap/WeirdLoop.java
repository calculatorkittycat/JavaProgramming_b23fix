package day_54_recap;

import java.util.Arrays;

public class WeirdLoop {

    public static void main(String[] args) {

        int[] arr = {5,10,15}; //5,10,15
        int[] arr1 = new int[arr.length]; // 0,0,0
        //      init j= 3-1 = 2       i < 3           +1   -1
        for(int i=0, j= arr.length-1; i < arr.length; i++, j--) {
            arr1[i] = arr[j];
        }

        System.out.println(Arrays.toString(arr1));

        for (int i = 0, j = 2; i < 3; i++, j--) {

        }

//gas 87
    }
}
