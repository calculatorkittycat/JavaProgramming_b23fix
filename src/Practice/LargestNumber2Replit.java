/*package Practice;

import java.util.Scanner;

public class LargestNumber2Replit {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
        int largestNum = 0;
        for (int[] arr1D : arr) {
            for (int element : arr1D) {
                if (element > largestNum)
                    largestNum = element;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = largestNum;
            }
        }




        //FINAL PRINT
        System.out.println(Arrays.deepToString(arr));
    }
}
*/