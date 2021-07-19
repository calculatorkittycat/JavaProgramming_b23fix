package day_20_loops;

public class FrequencyOfWord3 {
    public static void main(String[] args) {

        String sentence = "cat dog cat dog cat dog";
        String word1 = "cat";
        String word2 = "dog";
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i <= sentence.length()-word1.length(); i++) {
            String each = sentence.substring(i, i+ word1.length());
            if(each.equals(word1)){
                count1++;
            }

        }
        for (int i = 0; i <= sentence.length()-word2.length(); i++) {
            String each = sentence.substring(i, i+ word2.length());
            if(each.equals(word2)){
                count2++;
            }

        }
        System.out.println("count1 = " + count1);
        System.out.println("count2 = " + count2);
    }
}
