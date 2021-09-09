package Day_10_IfStatements;

public class TurnaryPractice02 {

    public static void main(String[] args) {
        int number = -100;

       // String result = (number > 0) ? "Positive" :(number <0)? "Negative" : "Zero";
        // the result     num is > 0 than positive else number less than zero
        //negative else zero!

       // System.out.println(result);

        System.out.println("_______________________");
        int score = 100;

        //char grade = (score >= 90)? 'A' :(score >=80)? 'B' :(score >= 70)? 'C' :(score >=60)? 'D'


        int num = 99;


        String res = (num <= 99) ? "one" : "two";

        System.out.println(res);


        int i = 5;
        String result = i % 2 == 0 ? "a" : i % 3 == 0 ? "b" : i % 5 == 0 ? "c" : i % 7 == 0 ? "d" : "e";
        System.out.println(result);
    }
}
