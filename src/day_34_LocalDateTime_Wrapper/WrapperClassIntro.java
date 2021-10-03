package day_34_LocalDateTime_Wrapper;

public class WrapperClassIntro {

    public static void main(String[] args) {

        //wrapper class only accepts corresponding primitive type
        short s = 10;
        int num = s;
        Integer num2 = (int)s;//can be casted //autoboxing:converting primitive value to wrapper class value

        char ch = '@';
        Character ch2 = (Character)  ch; //Autoboxing

        Byte b1 = 10;
        byte b2 = b1;
        short b3 = b1;
        int b4 = b1; //Unboxing. You can unbox into anything the primitive will fit inside
        long b5 = b1;
        float b6 = b1;
        double b7 = b1;

        System.out.println("___________________________________");//wrapper class only accepts its own primitive

        byte c1 = 10;
        Byte c2 = c1; //--  Autoboxing


        Byte b = 100;
        byte a = b;

        char cha = '@';
        Character cha1 = (Character) cha;






    }
}
