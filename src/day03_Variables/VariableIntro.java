package day03_Variables;

public class VariableIntro {
    public static void main(String[] args) {

        byte myAge = 30;
        byte myBrothersAge = 29;

        System.out.print("My age is: ");
        System.out.println(myAge);
        System.out.print("My brothers age is: ");
        System.out.println(myBrothersAge);


        short BirthYear = 1990;
        System.out.print("The year of my birth is: ");
        System.out.println(BirthYear);


        int Salary = 500000;
        System.out.print("My Salary is: ");
        System.out.println(Salary);


        long Number = 9999999999L;
        //If there is a number longer than what an int can hold it must be followed by an L
        System.out.println(Number);







    }
}
