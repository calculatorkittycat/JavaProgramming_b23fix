package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class InterviewQuestions {
    //number1
    //Reverse String - For loop
    public static String reverseString(String str) {
        String reverse = "";
        for(int i = str.length()-1; i >=0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
    //Reverse String - Char Array

    ////////////////////////////////////////////////////////////////////////////////////

//number2
    public static void printReverse (char[] letters){
        for (int i = letters.length-1; i >= 0 ; i--) {
            System.out.print(letters[i]);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
// number 3
// Prime Number
    public static boolean checkPrime(int n) {
        if ( n <= 1) {
            return false;
        }
        for (int i = 2; i <  Math.sqrt(n); i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //////////////////////////////////////////////////////////////////////////////////////

    //number 4
    //palindrome with charAt()
    public static boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() -1;
        while( head < tail) {
            if ( s.charAt(head) != s.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }


    public static void main(String[] args) {


        /////////////////////////////////////////////////////////////////////////////////////
        //number5
        //Reverse String - Array List - Iterator

        String input = "Geeks for Geeks";//String to be reversed
        String reverse ="";//where string will be stored when reversed
        ArrayList<Character> arrayList = new ArrayList<>();//new Character array list - blank

        for ( char c: input.toCharArray()){//for loop iterating String input after it is converted to a Char array
            arrayList.add(c);//Adding each element found in c to the array list
        }
        Collections.reverse(arrayList);//using collections to reverse the newly populated arraylist

        Object[] arr2 = arrayList.toArray();//dont understand

        for (int i = 0; i < arr2.length; i++) {
            reverse += arr2[i];
        }
        System.out.println(reverse);



        System.out.println(isPalindrome("racecar"));


        System.out.println("_________________________");

        System.out.println(checkPrime(49));
        System.out.println("_____________________");

        char[] name = {'a','b','c'};
        printReverse(name);




        System.out.println();
        String rev = InterviewQuestions.reverseString("dumb");
        System.out.println(rev);
/////////////////////////////////////////////////////////////////////////////////////////////


        //Another way
        String name1 = "Alper Aslan";
        System.out.println(name);
        String reversed = new StringBuilder(name1).reverse().toString();
        System.out.println(reversed);

        System.out.println("______________");

        //Another way StringBuilder
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());

        System.out.println("______________");



    }


}
