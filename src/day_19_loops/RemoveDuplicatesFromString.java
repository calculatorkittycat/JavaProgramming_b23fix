package day_19_loops;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {

        String word = "ababababab";
        String result = ""; //expected result "ab"


        for (int i = 0; i < word.length(); i++) { //index 0 to last index

            if (!result.contains("" + word.charAt(i))) {// if the character is not contained in the result yet
                result += word.charAt(i);// then add the character to the result
            }
            System.out.println("result = " + result);

        }
    }
}
