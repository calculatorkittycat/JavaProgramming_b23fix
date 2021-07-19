package day03_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 100;
        double lira = dollar * 8.41;
        double euro = dollar * 0.81;
        double rubl = dollar * 73.60;

        System.out.print("lira: ");
        System.out.print(lira);

        System.out.println("lira = " + lira);
        System.out.println("rubl = " + rubl);
        System.out.println("euro = " + euro);
        System.out.println("dollar = " + dollar);



    }
}
