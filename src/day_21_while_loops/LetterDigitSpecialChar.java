package day_21_while_loops;

public class LetterDigitSpecialChar {
    public static void main(String[] args) {

        String input = "mn@#123Ab!æ";
        String letters = ""; //mnAb
        String digits = ""; //123
        String specialChars = ""; //@!#

        for (int i = 0; i <= input.length()-1 ; i++) {
            char each = input.charAt(i);//gets each character from the string

            if(each >= 'A' && each <= 'Z') { //if the character is an upper case letter
                letters += each;
            }else if (each >= 'a' && each <= 'z') {//if the character is a lower case letter
                letters += each;
            }else if( each >= '0' && each <= '9'){// if the character is a digit
                digits += each;
                }else{//if the character is special character
                    specialChars += each;
                }

            }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
        }



    }

