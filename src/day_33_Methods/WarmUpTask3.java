package day_33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask3 {

    public static void main(String[] args) {

        int[] array = {1,2,2,3,3,4,5,5,6};//{1,4,6}
        int[] result = {};

        for (int each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
              result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }

        System.out.println(Arrays.toString(result));

        System.out.println("________________________________________");

        int[] array2 = {100,200,100,200,300,400,500,600,600};

        array2 = unique(array2);
        System.out.println(Arrays.toString(array2));

        System.out.println("________________________________________");

        double[] array3 = {2.5,2.5,3.5,4.5,4.5,7.4,7.1};

        double[] r2 = unique(array3);

        System.out.println(Arrays.toString(array3));

        System.out.println("__________________________");
        String[] items = {"lol", "lol", "wtf", "wtf", "stfu", "lmao"};

        String[] r3 = unique(items);

        System.out.println(Arrays.toString(r3));


    }

    public static int[] unique(int[] array){

        int[] result = {};

        for (int each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
                result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }
return result;

    }


    public static double[] unique(double[] array){

        double[] result = {};

        for (double each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
                result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }
        return result;

    }


    public static String[] unique(String[] array){

        String[] result = {};

        for (String each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
                result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }
        return result;

    }


    public static char[] unique(char[] array){

        char[] result = {};

        for (char each :  array) {//getting each element from array
            if ( frequency(array, each) == 1){//finding the frequency of every single element from the array//if the element is equal to 1 it is unique
                result =  ArraysUtility.addElement(result, each);//whenever a unique element it is found it is added to result
            }//when the loop is executed only the unique elements are added to result
        }
        return result;

    }

    public static int frequency(int[] array, int element) {
        int count = 0;//variable to help count how many items variable has appeared in array

        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    public static double frequency(double[] array, double element) {
        int count = 0;//variable to help count how many items variable has appeared in array

        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }


    public static double frequency(String[] array, String element) {
        int count = 0;//variable to help count how many items variable has appeared in array

        for (String each : array) {
            if (each.equals (element) ) {
                count++;
            }
        }
        return count;
    }


    public static double frequency(char[] array, char element) {
        int count = 0;//variable to help count how many items variable has appeared in array

        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }
}


/*
  3. create method that accepts one String array and one String and returns the frequency of the String
                Ex:
                    String[] array = {"Apple", "Apple", "Apple", "Orange"}

                    frequency(array, "Orange") ==> 1

        4. create method that accepts one char array and a char and returns the frequency of the char
 */