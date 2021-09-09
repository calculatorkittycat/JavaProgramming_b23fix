package day_53_Abstraction;

public class Porsche extends Car implements AutoPark{

    public Porsche(String model, String color, int year, double price) {
        super("Porsche", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto parking Porsche " + getModel());
    }

    @Override
    public void start() {
        System.out.println("Starting " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getModel());
    }
}
