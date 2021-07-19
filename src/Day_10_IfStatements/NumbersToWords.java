package Day_10_IfStatements;

public class NumbersToWords {

    public static void main(String[] args) {

        int number = 0;
        String word = "";

        if(number >= 0 && number <= 9){

            if(number == 1) {
                word = "one";
            }else if(number == 2) {
                word = "two";
            }else if(number == 3) {
                word = "three";
            }else if(number == 4) {
                word = "four";
            }else if (number == 5) {
                word = "five";
            }else if (number == 6) {
                word = "six";
            }else if (number == 7) {
                word = "seven";
            }else if (number == 8) {
                word = "eight";
            }else if (number == 9) {
                word = "nine";
            }else{
                word = "zero";
            }
        }else{
            word = "INVALID";
        }
        System.out.println(word);
    }
}
