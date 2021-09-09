package day_53_Abstraction;

public class Ford extends Car {

    public Ford( String model, String color, int year, double price) {
        super("Ford", model, color, year, price);
    }



    @Override
    public void start() {
        System.out.println("Starting ford " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving ford " + getModel());
    }
}
