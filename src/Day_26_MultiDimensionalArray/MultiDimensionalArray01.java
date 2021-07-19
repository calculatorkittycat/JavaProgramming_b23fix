package Day_26_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {
        // 2 dimensional array must contain 1 dimensional arrays
//                          1,2,3     0,1     0,1,2
        int[][] arr2d = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
//index                       0        1        2
        System.out.println(arr2d.length);//prints the index numbers of the multidimensional array

        System.out.println(Arrays.toString(arr2d));//will print hash, toString method is only for single dimensional arrays
        System.out.println(Arrays.deepToString(arr2d));//deep to string method will print a multidimensional array
        //{4,5}

        System.out.println(Arrays.toString(arr2d[1]));

        System.out.println((arr2d[1][1]));//will return the element at index 1,1

        System.out.println("_____________________________________________");

        for (int i = 0; i < arr2d.length; i++) {// i: index numbers of single dimensional arrays
            int[] each1DArray = arr2d[i]; //retrieve each single dimensional array
            System.out.println(Arrays.toString(each1DArray));
            for (int j = 0; j < each1DArray.length; j++) {// j: index numbers of the elements in each single dimensional array
                System.out.println(arr2d[i][j]);

            }
        }

        System.out.println("_____________________________________________");

        for (int[] each1d : arr2d) {//each element insides two dimensional array


            for( int element : each1d){//each element inside each one dimensional array
                System.out.println(element+ " ");
            }
            System.out.println();//appends new line

        }
    }
}
