package day_23_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    //adds integer to an int array
    public static int[] addElement(int[] array, int number){
        /*
        int[] result = new int[array.length+1];
        int i = 0;
        for (int each : array) {
             result[i++] =each;
        }
        result[i] = number;
         */

        int[] result = Arrays.copyOf( array,   array.length+1 );
        result[ result.length -1] = number;

        return result;
    }


    //adds double to a double array
    public static double[] addElement(double[] array,  double number){
        double[] result =  Arrays.copyOf(array, array.length+1 );  //{1.5, 2.5, 3.5, 0.0};
        result[result.length-1] = number; //{1.5, 2.5, 3.5, 4.5};

        return result;
    }


    //adds String to a String array
    public static String[] addElement(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length + 1) ;//  { A, B, null }
        result[result.length-1] = str; //  { A, B, C }
        return result;
    }


    // adds char to char array
    public static char[] addElement(char[] array, char ch){
        char[] result = Arrays.copyOf(array, array.length + 1) ;//  { A, B, null }
        result[result.length-1] = ch; //  { A, B, C }
        return result;
    }

    // returns the maximum number from an array of int
    public static int max(int[] array){
        int max= array[0] ;

        for (int each : array) {
            max =  Math.max( each, max  );
        }

        return max;
    }


    // returns the maximum number from an array of double
    public static double max(double[] array){
        double max= array[0] ;

        for (double each : array) {
            max =  Math.max( each, max  );
        }

        return max;
    }


    // returns the minimum number from an array of int
    public static int min(int[] array){
        int min= array[0] ;

        for (int each : array) {
            min =  Math.min( each, min  );
        }

        return min;
    }


    // returns the minimum number from an array of double
    public static double min(double[] array){
        double min= array[0] ;

        for (double each : array) {
            min =  Math.min( each, min  );
        }

        return min;
    }


    // merge two arrays of int
    public static int[] merge(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (int each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (int each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of double
    public static double[] merge(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (double each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (double each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of String
    public static String[] merge(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (String each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (String each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // merge two arrays of char
    public static char[] merge(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to contain the elements of arr1 and arr2

        int j = 0; // index
        for (char each : arr1){ // each element in arr1
            arr3[j++] = each;
        }

        for (char each : arr2) { // each element in arr2
            arr3[j++] = each;
        }

        return arr3;
    }


    // remove the element at given index of the array
    public static int[] remove(int[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        int[] result = new int[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // moves all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // remove the element at given index of the array
    public static double[] remove(double[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        double[] result = new double[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // remove the element at given index of the array
    public static String[] remove(String[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        String[] result = new String[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }


    // remove the element at given index of the array
    public static char[] remove(char[] array, int index){

        if(index < 0 || index > array.length -1 ){ // if the given index number is invalid
            System.err.println("Invalid Index");
            System.exit(0); // exits the system
        }

        char[] result = new char[array.length-1];

        for(int i = 0, j = 0; i < array.length; i++ ){
            if(i == index){ // stores all the elements of array except the element at given index
                continue;
            }else{
                result[j++]  = array[i];
            }
        }

        return result;
    }




}