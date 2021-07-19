package day_07;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PositiveNegativeAndZero {

    public static void main(String[] args) {



    int number = -100;


    boolean isPositive = number > 0;
    boolean isNegative = number < 0;
    boolean isZero = number == 0;
    //boolean isZero = isNegative == false && isPositive == false;
    //boolean isPositive = isNegative == false && isZero == false;

        System.out.println( " Is a positive number: " + isPositive);
        System.out.println( " Is a negative number: " + isNegative);
        System.out.println( " Is zero: " +isZero);


}



}
