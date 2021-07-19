package utilities;

import java.util.Arrays;

public class StringUtilities {

    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
return reverse;



    }


    public static boolean isPalindrome(String str){
       String reversedStr = reverse(str); //
        return str.equals(reversedStr);
    }


    // create a method that can remove duplicates from string, returns string
    public static String removeDup(String str){ // "AABBBCC"
        String result = "";   //"ABB"

        for (char ch : str.toCharArray() ) { //{'A', 'A', 'B', 'B', 'B', 'C', 'C'}

            if( !result.contains( ""+ch)){  //result.indexOf(ch) < 0
                // if the character is not contained in the result, then concate the character
                result += ch;
            }

        }

        return result;
    }


    // "heart"  & "earth"  ==> isAnagram ==> true
    public static boolean isAnagram(String str1, String str2){
        char[] ch1 = str1.toCharArray(); //{'h', 'e', 'a', 'r', 't'}
        char[] ch2 = str2.toCharArray(); // {'e', 'a', 'r', 't', 'h'}

        Arrays.sort(ch1); // {a, e, h, r. t}
        Arrays.sort(ch2); // {a, e, h, r. t}

        return  Arrays.equals(ch1, ch2);

    }


    //frequency of chars("AAAABB" , 'A') ===> 4
    public static int frequency(String str, char ch){
        int count = 0;

        for (char each : str.toCharArray()) {//each: represent each character of str
            if(each == ch){
                count++;
            }
        }

        return count;
    }

    //unique characters in a string
    public static String uniqueChars(String s){

        String unique = "";

        for (int i = 0; i <= s.length()-1 ; i++) {
            char  each = s.charAt(i);
            int frequency = frequency(s,each);
            if(frequency == 1){
                unique += each;
            }
        }
        return unique;
    }

    //frequency of chars AABBBC = "A2B3C1"
    public static String frequencyOfChars(String str){

        String result = "";

        for( char each :  removeDup(str).toCharArray()) {// each: A, B, C
            int frequency = frequency(str, each);// gets the frequency of each character
            result += each;//"ABC"
            result += frequency;//"A3B2C4"
        }
        return result;
    }

    //Returns the frequency of a word from any string //int freq = frequencyOfWords(sentence, word); then sout freq
    public static int frequencyOfWords(String sentence, String word ){

        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");//replaces word with empty string
            count++;// adds to the count of empty strings, in otherwords the ammount of the word that has been replaced
        }
        return count;
    }

}
