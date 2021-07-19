package day_30_Review;

import utilities.StringUtilities;

//import utilities.StringUtilities;
public class MethodsReview {

    public static void main(String[] args) {

        String str = "mamarich";

        String result = StringUtilities.reverse(str);

        System.out.println(str);

        String word = "Anna";

        System.out.println( StringUtilities.isPalindrome(word));
    }
}
