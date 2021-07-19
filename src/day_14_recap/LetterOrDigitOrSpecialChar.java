package day_14_recap;

public class LetterOrDigitOrSpecialChar {
    public static void main(String[] args) {


        char ch = 'æ';

        boolean isDigit = ch >= '0' && ch <= '9';

        boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
                            //if the character is uppercase letter or lowercase letter

 // boolean isSpecialCharacter = !isDigit && !isLetter;
       /* String result = "";
        if(isDigit){
            result = ch + " Digit";
        }else if (isLetter){
            result = ch + " letter";
        }else{
            result = ch +  " special char";
        }
        System.out.println("result = " + result);

        */

        String result = (isDigit)? ch+ " is digit" :(isLetter)? ch + " is a letter": ch+ " is a special char";
        System.out.println("result = " + result);


    }
}
