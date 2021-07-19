package day_19_loops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        //this will check the string one by one and add the character if it is not added to the result string already
        System.out.println("Enter a word that is 5 characters long");
        String word = new Scanner(System.in).next();

        String result = ""; //"abc"

        if(word.length()==5) {//when the length is equal to five continue with the if statements if NOT skip to else if

            //'!.result.contains' means DOES NOT contain
            if (!result.contains("" + word.charAt(0))) { //this is checking 'result' string for the first character in 'word', if it is not there then add charAt 0 of result
                result += word.charAt(0);
            }
            if (!result.contains("" + word.charAt(1))) {//this statement is false because it is checking for an 'a' in 'result' which was added already
                result += word.charAt(1);
            }
            if (!result.contains("" + word.charAt(2))) {//checking if result does not contain 'b' if it does not execute next line,
                result += word.charAt(2);//this line adds charAt2 which is b to the string 'result'
            }
            if (!result.contains("" + word.charAt(3))) {//charAt 3 is B and is already concat in 'result' so this is false and skip to next if statement
                result += word.charAt(3);
            }
            if (!result.contains("" + word.charAt(4))) {//checking if 'result' does not contain charAt4 which is 'c', since it is not there it will execute the next line
                result += word.charAt(4);
            }                                  // at this point a, b, and c have been added to string 'result'


        }else if (word.length() > 5){
            result = "Too long";
        }else{
            result = "Too short";
        }
        System.out.println(result);
    }
}
/*
1. ask the user to enter a word.
the word must be five characters long and print the word without the duplicated characters,
but if the word is less than five characters long, print "Too Short."
and if the word is more than five characters long, print "Too long."

        Ex:
            input:
                aabbc

             output:
                 abc
 */