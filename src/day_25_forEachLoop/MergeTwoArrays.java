package day_25_forEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4},
               arr2 = {5,6};

        int[] arr3 = new int[arr1.length + arr2.length]; //making sure that arr3 has enough capacity to contain the elements of arr1 and arr2
        //{0,0,0,0,0,0}


        int j = 0; // for the index numbers of third array
        for (int i = 0; i < arr1.length; i++) {//for arr1
            arr3[j++] = arr1[i];//retrieves each element from arr1 one and assigns to the indexes of 3rd array
        }

        for (int i = 0; i < arr2.length; i++) {// for arr2
            arr3[j++] =arr2[j];//retrieves each element from arr2 and assigns to the indexes of 3rd array
        }


        System.out.println(Arrays.toString(arr3));

        int[] a1= {1,2,3,4};
        String[] s1 ={"a", "b"};

        Object[] r = {"a",1,'c',true};
        System.out.println(r);


    }
}
/*
 write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */
