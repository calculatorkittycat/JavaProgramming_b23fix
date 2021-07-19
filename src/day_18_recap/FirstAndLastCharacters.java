package day_18_recap;

import java.util.Scanner;

public class FirstAndLastCharacters {
    public static void main(String[] args) {

// combine both words removing last e of first and first e of last
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Two Words");
        String word1 = scan.next(); //one
        String word2 = scan.next(); //eight

        /*
        if(word1.charAt(word1.length() -1 ) == word2.charAt(0)  ){
            //last character of first word1 == to first character of word to

            System.out.println(word1 + word2.substring(1) );

        }else{
            System.out.println(word1+word2);
        }

        */

        
        if( word1.substring(word1.length()-1).equalsIgnoreCase(  ""+word2.charAt(0)  )  ){
            System.out.println(word1 + word2.substring(1));

        }else{
            System.out.println(word1+word2);
        }

    }
}
