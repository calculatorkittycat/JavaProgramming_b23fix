package day_16_String;

import java.util.Scanner;

public class StringPractice03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string with 3 characters");
        String word = scan.next();

        String result = "";

        if(word.length() == 3){// if word has 3 characters only
            if( word.charAt(1) == 'a'){//if the middle character is equal to a
                result = "Cool Word";//print
            }else{//if not
                result = "Okay Word";//print ok word
            }



        }else{ //if the word has more than three characters or less than 3 characters

            if(word.length()<3){
                result = "Word is too short";
            }else{
                result = "Word is too long";
            }

        }
        System.out.println(result);
        scan.close();
    }

}
