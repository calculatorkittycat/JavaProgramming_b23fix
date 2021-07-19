package day_32;

import day_30_Review.ArraysReview;

import java.util.Arrays;

public class WarmupTask2 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] array1 = {1.4,4.2,5.2,6.5,7.7};
        String[] array2 = {"lol","wtf", "stfu", "rolf", "lmao"};
        char[] array3 = {'a','b','c','d','e'};

        int element = 10;

        System.out.println(Arrays.toString(array));

        array = addInteger(array,element);//1,2,3,4,5,6,7,9,10
        System.out.println(Arrays.toString(array));

        array = addInteger(array,11);
        System.out.println(Arrays.toString(array));

        System.out.println("________________________________");

        array1 = addDouble(array1, 15.8);
        System.out.println(Arrays.toString(array1));

        System.out.println("________________________________");

        array2 = addString(array2,"zazzlezorz");
        System.out.println(Arrays.toString(array2));

        System.out.println("________________________________");

        array3 = addChar(array3, 'G');
        System.out.println(Arrays.toString(array3));

        System.out.println("________________________________");//add element

        array2 = addElement(array2,"wtf");
        System.out.println(Arrays.toString(array2));

        System.out.println("________________________________");

        array3 =addElement(array3, 'æ');
        System.out.println(Arrays.toString(array3));

        System.out.println("________________________________");

        array1 = addElement(array1, 999.9);
        System.out.println(Arrays.toString(array1));

        System.out.println("________________________________");

        array = addElement(array, 9123);
        System.out.println(Arrays.toString(array));



    }

//_________________________________add int....................................

    public static int[] addInteger(int[] array, int number) {
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

//_________________________________add double....................................
    public static double[] addDouble(double[] array, double number){

        double[] result = Arrays.copyOf(array, array.length+1);
        result[result.length -1] = number;
        return result;
    }

//_________________________________add string....................................

    public static String[] addString(String[] array, String word){

        String[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = word;
        return result;
    }

//_________________________________add char....................................

    public static char[] addChar(char[] array , char character){

        char[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = character;
        return result;
    }

//_________________________________add int Method Overload....................................

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
    //_________________________________add double Method Overload....................................
    public static double[] addElement(double[] array, double number){

        double[] result = Arrays.copyOf(array, array.length+1);
        result[result.length -1] = number;
        return result;
    }

//_________________________________add string Method Overload....................................

    public static String[] addElement(String[] array, String word){

        String[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = word;
        return result;
    }

//_________________________________add char Method Overload....................................

    public static char[] addElement(char[] array , char character){

        char[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = character;
        return result;
    }



}








/*
    1. create a return method called addInteger that can add an Integer number after the  last index of an integer array

    2. create a return method called addDouble that can add a double number after the last index of a double array

    3. create a return method called addString that can add a String after the last index of a String array

    4. create a return method called addChar that can add a char after last index of a char array

 */