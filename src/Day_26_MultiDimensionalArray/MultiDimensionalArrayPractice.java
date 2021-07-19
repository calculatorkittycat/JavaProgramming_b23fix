package Day_26_MultiDimensionalArray;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        int arr2D[][] = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};


        for (int i = arr2D.length - 1; i >= 0; i--) {// is the the index number of each single dimensional array

            for (int j = 0; j < arr2D[i].length; j++) {// j is representing the index number of each element in single dimension array starting from 0
                System.out.print(arr2D[i][j] + " ");

            }
        }
        System.out.println();


        

        for ( int[] each1d : arr2D ) {// is the the index number of each single dimensional array

            for (int j = each1d.length-1;  j >= 0; j--) {// j is representing the index number of each element in single dimension array starting from 0
                System.out.print(each1d[j] + " ");

            }
            System.out.println();
        }
        System.out.println("_______________________________________________");

        for (int i = arr2D.length - 1; i >= 0; i--) {// i: is representing the index number of each element in single dimension array starting from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
            
        }
        
        
    }
}
/*
Given:
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3


            task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9

            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */