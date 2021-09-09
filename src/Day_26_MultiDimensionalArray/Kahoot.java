package Day_26_MultiDimensionalArray;

import java.util.Arrays;

public class Kahoot {

    public static void main(String[] args) {


        int[][] arr2d = {{1, 2, 3}, {4, 5}, {6, 7, 8}};


        for (int i = 0; i < arr2d.length; i++) {// i: index numbers of single dimensional arrays
            int[] each1DArray = arr2d[i]; //retrieve each single dimensional array
            System.out.println(Arrays.toString(each1DArray));
            for (int j = 0; j < each1DArray.length; j++) {// j: index numbers of the elements in each single dimensional array
                System.out.println(arr2d[i][j]);

            }
        }
    }
}
