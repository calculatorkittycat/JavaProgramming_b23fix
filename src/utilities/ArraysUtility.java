package utilities;

import java.util.Arrays;

public class ArraysUtility {



    //________________________________________Method Overload.....................................





    //_______________________________________________add int .....................................

    public static int[] addElement(int[] array, int number) {
        /*
        int [] result = new int[array.length+1];//length of given array +1
        int i = 0;
        for (int each : array) {//each is representing each element of the array
           result[i++] = each;
        }
        result[i] = number;

         */

        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = number; //this line goes to the last index of array and assigns given number
        return result;
    }
    //_________________________________add double ................................................
    public static double[] addElement(double[] array, double number){

        double[] result = Arrays.copyOf(array, array.length+1);
        result[result.length -1] = number;
        return result;
    }

    //_________________________________add string.................................................

    public static String[] addElement(String[] array, String word){

        String[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = word;
        return result;
    }

    //_________________________________add char ..................................................

    public static char[] addElement(char[] array , char character){

        char[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = character;
        return result;
    }

    //_________________________________Max number from int array..................................
    public static int max(int[] array){
        int max = array[0];

        for (int each : array) {
            max = Math.max(each, max);
        }

        return max;
    }

    //_________________________________Max number from double array...............................

    public static double max(double[] array){
        double max = array[0];

        for (double each : array) {
            max = Math.max(each, max);
        }

        return max;
    }

    //_________________________________Min number from int array..................................

    public static int min(int[] array){
        int min = array[0];

        for (int each : array) {
            min = Math.min(each, min);
        }

        return min;
    }

    //_________________________________Min number from double array...............................

    public static double min(double[] array){
        double min = array[0];

        for (double each : array) {
            min = Math.min(each, min);
        }

        return min;
    }

    //_________________________________Merge two int arrays.......................................
    public static int[] merge(int[] arr1,int [] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int j = 0;
        for (int each : arr1) {//each element in arr1
            arr3[j++] = each;
        }

        for (int each : arr2) { // each element in arr2
            arr3[j++] = each;
        }
        return arr3;
    }

    //_________________________________Merge two double arrays....................................
    public static double[] merge(double[] arr1,double [] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {//each element in arr1
            arr3[i++] = each;
        }

        for (double each : arr2) { // each element in arr2
            arr3[i++] = each;
        }
        return arr3;
    }

    //_________________________________Merge two String arrays....................................
    public static String[] merge(String[] arr1,String [] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {//each element in arr1
            arr3[i++] = each;
        }

        for (String each : arr2) { // each element in arr2
            arr3[i++] = each;
        }
        return arr3;
    }

    //_________________________________Merge two Char arrays......................................
    public static char[] merge(char[] arr1,char [] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];

        int i = 0;
        for (char each : arr1) {//each element in arr1
            arr3[i++] = each;
        }

        for (char each : arr2) { // each element in arr2
            arr3[i++] = each;
        }
        return arr3;
    }

    //_________________________________remove element from given int array index..................
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

    //_________________________________remove element from given double array index...............
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

    //_________________________________remove element from given String array index...............
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

    //_________________________________remove element from given Char array index.................
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

    //_________________________________reverse int array..........................................
    public static int[] reverse(int[] array){//{1,2,3,4,5} // i: starts last index to zero
        int[] result = new int[array.length];//{0,0,0,0,0} // j: 0 to last index

        for (int i = array.length-1, j= 0; i >= 0 ; i--, j++) {//decrease i because it is running backwards
            result[j] = array[i];
        }
        return result;
    }

    //_________________________________reverse String array.......................................
    public static String[] reverse(String[] array){//{1,2,3,4,5} // i: starts last index to zero
        String[] result = new String[array.length];//{0,0,0,0,0} // j: 0 to last index

        for (int i = array.length-1, j= 0; i >= 0 ; i--, j++) {//decrease i because it is running backwards
            result[j] = array[i];
        }
        return result;
    }

    //_________________________________reverse double array.......................................
    public static double[] reverse(double[] array){//{1,2,3,4,5} // i: starts last index to zero
        double[] result = new double[array.length];//{0,0,0,0,0} // j: 0 to last index

        for (int i = array.length-1, j= 0; i >= 0 ; i--, j++) {//decrease i because it is running backwards
            result[j] = array[i];
        }
        return result;
    }

    //_________________________________reverse char array.........................................
    public static char[] reverse(char[] array){//{1,2,3,4,5} // i: starts last index to zero
        char[] result = new char[array.length];//{0,0,0,0,0} // j: 0 to last index

        for (int i = array.length-1, j= 0; i >= 0 ; i--, j++) {//decrease i because it is running backwards
            result[j] = array[i];
        }
        return result;
    }

    //_________________________________boolean :contains in int...................................
    public static boolean contains(int[] array, int element){

        for (int each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }

    //_________________________________boolean :contains in double................................
    public static boolean contains(double[] array, double element){

        for (double each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }

    //_________________________________boolean :contains in String................................
    public static boolean contains(String[] array, String element){

        for (String each : array) {
            if(each.equals( element ) ){
                return true;
            }
        }

        return false;
    }

    //_________________________________boolean :contains in char[]................................
    public static boolean contains(char[] array, char element){

        for (char each : array) {
            if(each == element  ){
                return true;
            }
        }

        return false;
    }

    //_________________________________find unique elements in int[]..............................
    public static int[] unique(int[] array){

        int[] result = {};

        for (int each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
                result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }
        return result;

    }

    //_________________________________find unique element in double[]............................
    public static double[] unique(double[] array){

        double[] result = {};

        for (double each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
                result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }
        return result;

    }

    //_________________________________find unique element in string[]............................
    public static String[] unique(String[] array){

        String[] result = {};

        for (String each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
                result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }
        return result;

    }

    //_________________________________find unique element in char[]..............................
    public static char[] unique(char[] array){

        char[] result = {};

        for (char each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
                result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }
        return result;

    }

    //_________________________________find frequency of element in string[]......................
    public static int frequency(int[] array, int element) {
        int count = 0;//variable to help count how many items variable has appeared in array

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //_________________________________find frequency of element in double[]......................
    public static double frequency(double[] array, double element) {
        int count = 0;//variable to help count how many items variable has appeared in array

        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //_________________________________find frequency of element in String[]......................
    public static double frequency(String[] array, String element) {
        int count = 0;//variable to help count how many items variable has appeared in array

        for (String each : array) {
            if (each.equals (element) ) {
                count++;
            }
        }
        return count;
    }

    //_________________________________find frequency of element in char[]........................
    public static double frequency(char[] array, char element) {
        int count = 0;//variable to help count how many items variable has appeared in array

        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    //_________________________________Remove duplicates from int[]................................
    public static int[] removeDup(int[] array){
        int[] newArray = {};//temp var// if contains 1 dont add 1, if does not contain 2 add 2, if does contain 2 dont add 2. as loop executes

        for (int each : array) {

            if(!ArraysUtility.contains(newArray, each)){// if the element is not already in the new array, then add the element to the new array
                newArray = ArraysUtility.addElement(newArray, each);
            }
        }
        return newArray;
    }

    //_________________________________Remove duplicates from double[].............................
    public static double[] removeDup(double[] array){
        double[] newArray = {};//temp var// if contains 1 dont add 1, if does not contain 2 add 2, if does contain 2 dont add 2. as loop executes

        for (double each : array) {

            if(!ArraysUtility.contains(newArray, each)){// if the element is not already in the new array, then add the element to the new array
                newArray = ArraysUtility.addElement(newArray, each);
            }
        }
        return newArray;
    }

    //_________________________________Remove duplicates from String[].............................
    public static String[] removeDup(String[] array){
        String[] newArray = {};//temp var// if contains 1 dont add 1, if does not contain 2 add 2, if does contain 2 dont add 2. as loop executes

        for (String each : array) {

            if(!ArraysUtility.contains(newArray, each)){// if the element is not already in the new array, then add the element to the new array
                newArray = ArraysUtility.addElement(newArray, each);
            }
        }
        return newArray;
    }

    //_________________________________Remove duplicates from char[]...............................
    public static char[] removeDup(char[] array){
        char[] newArray = {};//temp var// if contains 1 dont add 1, if does not contain 2 add 2, if does contain 2 dont add 2. as loop executes

        for (char each : array) {

            if(!ArraysUtility.contains(newArray, each)){// if the element is not already in the new array, then add the element to the new array
                newArray = ArraysUtility.addElement(newArray, each);
            }
        }
        return newArray;
    }
}


