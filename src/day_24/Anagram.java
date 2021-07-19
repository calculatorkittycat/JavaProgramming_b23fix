package day_24;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        /*
        heart, earth
         */

        String s1 = "heart"; // sort aerhrt
        String s2 = "earth";



        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);// this will sort ch1 into ascending order
        Arrays.sort(ch2);//and this one ch2

        System.out.println(Arrays.toString(ch1));//this prints the newly Alphabetized arrays that were created from string
        System.out.println(Arrays.toString(ch2));

        boolean isAnagram = Arrays.equals(ch1,ch2);// this checks if the two Alphabetized arrays are equal and assigns them to a boolean variable
        // if they contain the same number of chars and chars they are anagram

        System.out.println("isAnagram = " + isAnagram);





    }
}
