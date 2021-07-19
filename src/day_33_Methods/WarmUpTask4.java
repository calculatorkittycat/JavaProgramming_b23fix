package day_33_Methods;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask4 {

    public static void main(String[] args) {


        String str = "aaaabbbbbcc"; //abc
        String result = ""; //"abc"


        for (int i = 0; i < str.length(); i++) {//
            char each = str.charAt(i);//          representing each character
            if(!result.contains(""+each)){//if it does not contain add to each //concating to a string makes it a string
                result += each;
            }
        }

        System.out.println(result);

        System.out.println("___________________________________");
        int[] array = {1,1,1,2,2,2,3,3,3,3,4,4,4,5,5,5,5,};// {1,2,3,4,5}
        int[] newArray = {};//temp var// if contains 1 dont add 1, if does not contain 2 add 2, if does contain 2 dont add 2. as loop executes

        for (int each : array) {

            if(!ArraysUtility.contains(newArray, each)){
               newArray = ArraysUtility.addElement(newArray, each);
            }
        }

        System.out.println(Arrays.toString(newArray));


        System.out.println("___________________________________");

        int[] numbers = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};

        //OR//int[] r1 = removeDup(numbers);
        numbers = removeDup(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println("___________________________________");




    }

    //_______________________________Remove duplicates from int[]..............................
    public static int[] removeDup(int[] array){
    int[] newArray = {};//temp var// if contains 1 dont add 1, if does not contain 2 add 2, if does contain 2 dont add 2. as loop executes

    for (int each : array) {

        if(!ArraysUtility.contains(newArray, each)){// if the element is not already in the new array, then add the element to the new array
            newArray = ArraysUtility.addElement(newArray, each);
        }
    }
    return newArray;
}

    //_______________________________Remove duplicates from double[]..............................
    public static double[] removeDup(double[] array){
        double[] newArray = {};//temp var// if contains 1 dont add 1, if does not contain 2 add 2, if does contain 2 dont add 2. as loop executes

        for (double each : array) {

            if(!ArraysUtility.contains(newArray, each)){// if the element is not already in the new array, then add the element to the new array
                newArray = ArraysUtility.addElement(newArray, each);
            }
        }
        return newArray;
    }

    //_______________________________Remove duplicates from String[]..............................
    public static String[] removeDup(String[] array){
        String[] newArray = {};//temp var// if contains 1 dont add 1, if does not contain 2 add 2, if does contain 2 dont add 2. as loop executes

        for (String each : array) {

            if(!ArraysUtility.contains(newArray, each)){// if the element is not already in the new array, then add the element to the new array
                newArray = ArraysUtility.addElement(newArray, each);
            }
        }
        return newArray;
    }

    //_______________________________Remove duplicates from char[]..............................
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
