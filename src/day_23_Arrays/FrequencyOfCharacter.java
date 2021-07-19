package day_23_Arrays;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabcccd";

        char ch = 'c';
        int frequency = 0; // for the frequency of the char variable

        for (int i = 0; i < str.length() - 1; i++) {

            char each = str.charAt(i);// will get each character of the string from 0 to end of the "str" string
            if (each == ch) {//only string can use the .equals method
                frequency++;//frequency will be increased by one of the condition is true:: if each character in str is matching with ch
            }

        }
        System.out.println("frequency = " + frequency);
    }
}


/*
1. Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0

 */