package Day_12_Scanner;

public class FizzAndBuzz {

    public static void main(String[] args) {
        int  number = 5;
        String result = "";

        switch (number){
            case 3:
            case 6:
            case 9:
                result = ("Fizz");
                break;
            case 1:
                result = ("One");
            case 2:
                result = ("Two");
            case 4:
                result = ("Four");
            case 7:
                result = ("Seven");
            case 8:
                result = ("Eight");
                break;

            case 5:
            case 10:
                result = ("Buzz");
                break;

            default:
                result = ("Invalid");
        }
        System.out.println("result = " + result);



    }
}
