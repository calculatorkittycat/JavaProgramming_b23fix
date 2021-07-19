package day_33_Methods;

import java.util.Arrays;
import utilities.ArraysUtility;// IMPORT STATEMENT for Arrays Utility

public class WarmUpTask0 {

    public static void main(String[] args) {

        int[] arr1 = {100,200,300,400,500,600};
        System.out.println("before remove " + Arrays.toString(arr1));

        arr1=removeIndex(arr1,3); //{100,200,300,500,600}

        System.out.println("After remove " + Arrays.toString(arr1));

        System.out.println("___________________________________");

        double[] arr2 ={3.4,5.4,7.2,9.2,2.6};
        System.out.println("before remove " + Arrays.toString(arr2));

        arr2 = removeIndex(arr2,3);

        System.out.println("After remove " + Arrays.toString(arr2));

        System.out.println("___________________________________");

        String[] students = {"joe", "john", "jeff", "jake" , "jerry"};
        System.out.println("before remove " + Arrays.toString(students));

        students = removeIndex(students,2);

        System.out.println("After remove " + Arrays.toString(students));

        System.out.println("___________________________________");

        char[] chars = {'æ', 'Ä', '█', '╜', '▌',};
        System.out.println("before remove " + Arrays.toString(chars));

        chars = removeIndex(chars, 3);

        System.out.println("after remove " + Arrays.toString(chars));

        System.out.println("___________________________________");

        char[] chars1 = {'A', 'B', 'C', 'D', 'E'};
        char[] chars2 = {'F', 'G', 'H', 'I', 'J'};




    }



    //
    //remove element from given int array index
    public static int[] removeIndex(int[] array, int index){

        if(index <0 || index > array.length-1){// if the given index number is invalid
            System.err.println("FAIL. Unable to remove index. Index number out of bounds of array.");
            System.exit(0);
        }


        int[] result = new int[array.length-1];

        for (int i = 0, j = 0; i < array.length; i++) {

            if( i == index){//moves all the elements of array except element at given index
                continue;
            }else{
                result[j++] = array[i];
            }
        }

        return result;
    }


    //remove element from given double array index
    public static double[] removeIndex(double[] array, int index){

        if(index <0 || index > array.length-1){// if the given index number is invalid
            System.err.println("FAIL. Unable to remove index. Index number out of bounds of array.");
            System.exit(0);
        }


        double[] result = new double[array.length-1];

        for (int i = 0, j = 0; i < array.length; i++) {

            if( i == index){//stores all the elements of array except element at given index
                continue;
            }else{
                result[j++] = array[i];
            }
        }

        return result;
    }

    //remove element from given String array index
    public static String[] removeIndex(String[] array, int index){

        if(index <0 || index > array.length-1){// if the given index number is invalid
            System.err.println("FAIL. Unable to remove index. Index number out of bounds of array.");
            System.exit(0);
        }


        String[] result = new String[array.length-1];

        for (int i = 0, j = 0; i < array.length; i++) {

            if( i == index){//stores all the elements of array except element at given index
                continue;
            }else{
                result[j++] = array[i];
            }
        }

        return result;
    }

    //remove element from given Char array index
    public static char[] removeIndex(char[] array, int index){

        if(index <0 || index > array.length-1){// if the given index number is invalid
            System.err.println("FAIL. Unable to remove index. Index number out of bounds of array.");
            System.exit(0);
        }


        char[] result = new char[array.length-1];

        for (int i = 0, j = 0; i < array.length; i++) {

            if( i == index){//stores all the elements of array except element at given index
                continue;
            }else{
                result[j++] = array[i];
            }
        }

        return result;
    }
}
