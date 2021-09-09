package day_53_Abstraction;

public interface ElectricCar {

    boolean hasBattery = true;// this variable is public final by default

    public static void main(String[] args) {
        System.out.println(hasBattery); // this variable is static because it is being called within a static method, the main method is static
    }

    void charging();

    //one abstract method in this class


}
