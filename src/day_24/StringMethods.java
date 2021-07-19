package day_24;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
    //split
    String sentence = "To win the game you must defeat me john romero";

    String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = words.length -1; i >= 0; i--) {
            System.out.print(words[i]+ " ");
        }
        System.out.println();

        String email = "JohnRomero@gmail.com";

        
        String firstName = email.split("@")[0];

        System.out.println("firstName = " + firstName);
        
// toCharArray()

        String str ="A,BCDE!";
       char[] characters = str.toCharArray();

        System.out.println(Arrays.toString(characters));





    }
}
