package day_27_review;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "abccdd efggggh";
/*
        for (int i = 0; i <= str.length()-1; i++) {
            char each = str.charAt(i);//this is way of getting each character in the string with the for loop. it is longer
        }

 */

        for (char each : str.replace(" ", "").toCharArray()){// represents each character of str excluding space
                                    //.replace here will replace all " " with "" or space with no space
            if(str.indexOf(each) == str.lastIndexOf(each)){// if the characters first and last index number are the same
                System.out.println(each);
                break;
            }
        }
    }
}
