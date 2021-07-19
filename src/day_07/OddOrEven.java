package day_07;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 101;

        boolean even = number%2 == 0;
        boolean odd = number%2 != 0; // if the number is not an even number than it is an odd number. so if it is divisible by two then it is even
                                    // so what it is saying at line 9 is that if the remainder if equal to zero than it is an even number
                                    // line time is saying that the number is odd if line 9 is false!

        System.out.println(number + " is odd: " + odd );
        System.out.println(number + " is even: " + even);




    }
}
