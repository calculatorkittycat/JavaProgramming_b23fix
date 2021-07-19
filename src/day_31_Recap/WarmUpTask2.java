package day_31_Recap;


public class WarmUpTask2 {

    public static void main(String[] args) {

        String sentence = "Java java JavA";
        String word = "java";

        int count = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");//replaces word with empty string
            count++;// adds to the count of empty strings, in otherwords the ammount of the word that has been replaced
        }


        System.out.println(count);

    }
    //Returns the frequency of a word from any string
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
