package day_04_Variables_pracitce;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number%2 == 0;  //If the remainder of number divided by two is equal to zero than it is even
        boolean isOdd = number%2 > 0;  //if the remainder of number is greater than zero then the number is odd

        System.out.println(number + " is an even number: "  + isEven);
        System.out.println(number + " is an odd number: " +isOdd);




    }
}
