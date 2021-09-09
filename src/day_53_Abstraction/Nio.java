package day_53_Abstraction;

public class Nio extends Car implements ElectricCar{

    public Nio(String model, String color, int year, double price) {
        super("Nio", model, color, year, price);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void charging() {

    }
}
