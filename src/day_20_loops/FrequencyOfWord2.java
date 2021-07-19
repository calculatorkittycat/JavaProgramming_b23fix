package day_20_loops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "I love books, I purchase a lot of books";
        String word = "books";

        int count = 0; //count will be increased by one every time the word Python is found
        //"Python"
        for (int i = 0; i <= sentence.length()-word.length(); i++) { // because of the limit -6 it will not exit the range of the string
                    String each = sentence.substring(i, i+word.length());
                    //                 0, 6
                    //                 1, 7
            if(each.equals(word)){ //if string "each" equals "Python" increase the int variable "count" by one
                count++;
            }


        }
        System.out.println("count = " + count);
    }
}
