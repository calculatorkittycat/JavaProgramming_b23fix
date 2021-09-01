package day_29_ReternMethod;

public class ReturnMethods {

    public static void main(String[] args) {
        String str = "Java";

        String reverseStr = reverse(str);
        isPalindrome(str);
        boolean isPalindrome = isPalindrome(str);

        System.out.println("isPalindrome = " + isPalindrome);





    }


    public static String reverse(String str) {//"A,B,C"
        String result = "";//declare variable that can contain the reverse characters of the string
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }


        return result;
    }

    public static boolean isPalindrome(String str){

        String reversedStr = reverse(str);
/*
        if(reversedStr.equals(str)){
            System.out.println(str+" is a palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
 */
        return (reversedStr.equalsIgnoreCase(str)) ? true : false;





    }



}
