package day03_Variables;

public class VariablePractice1 {

    public static void main(String[] args) {


        //double vs float

        System.out.println(0.5);
        double num1 = 0.5;
        float num2 = 0.5f;

        //if you are going to use a float number it must be followed by an F lower or upper


        byte byteNumber =100;
        short shortNumber = byteNumber;

        //byte byteNumber2 = shortNumber;  larger type cannot be assigned to smaller type

        int intNumber = 100;
        long longNumber = intNumber;
        //smaller primitive type can be assigned to a larger type



    }
}
