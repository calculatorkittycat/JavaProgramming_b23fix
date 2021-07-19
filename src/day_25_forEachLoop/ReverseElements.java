package day_25_forEachLoop;

import java.util.Arrays;

public class ReverseElements {

    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#"};

        for (int j = 0; j < array.length; j++) {//index numbers of the array starting from 0

            String element = array[j]; //each element of the array
            //0123
            String reverse = ""; // to store the reversed version of the element

            for (int i = element.length()-1; i >= 0; i--) {//index numbers of the element string
                reverse+=element.charAt(i);//gets the characters from the string element starting from last index to index 0
                // this inner loop is responsible for reversing the string
            }
            array[j] = reverse;// assigning reversed element to the index of the array
        }



        System.out.println(Arrays.toString(array));
    }
}
