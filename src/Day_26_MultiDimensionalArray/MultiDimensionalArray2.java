package Day_26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {


        // int[] nums = {1,2,3};
        //int [][] nums =  { {1,2,3},{4,5,6}  }; //multidimensional arrays contain multiple single dimension arrays
        int[][][] arr3d = {{{1, 2, 3}, {4, 5, 6}}, {{6, 7, 8}, {9, 10}}};
        //                           0                       1
        //                      0          1            0         1
        //                   0, 1, 2    0, 1, 2      0, 1, 2    0, 1
        // [0][0,1][0,1,2]

        System.out.println(Arrays.deepToString(arr3d));//whole multidimensional array

        // {{6,7,8},{9,10}}
        System.out.println(Arrays.deepToString(arr3d[1]));//just index one of multidimensional array

        //{4,5,6}
        System.out.println(Arrays.toString(arr3d[0][1]));/// use to.string method when just printing elements

        //{8}

        System.out.println(arr3d[1][0][2]);// no to.string or to.deepToString method required when printing a single element

        System.out.println("______________________________________________");

        for (int[][] each2d : arr3d) {// for getting each 2 dimensional array from arr3d
            for (int[] each1d : each2d) {// for getting 1 dimensional arrays from 2 dimensional arrays
                for (int element : each1d) {// for getting the elements from each single dimensional array
                    System.out.print(element + " ");

                }
                System.out.println();// to append new line after printing the elements in each of the 1 dimensional arrays
            }
        }
        System.out.println("______________________________________________");

        int[][][] arr4d = {{{1, 2, 3}, {4, 5, 6}}, {{6, 7, 8}, {9, 10}} , {{10,20,30} , {40,50}} , {{60,70,80} , {90, 100}}};

        System.out.println(arr4d[0][1][3]);
    }
}
