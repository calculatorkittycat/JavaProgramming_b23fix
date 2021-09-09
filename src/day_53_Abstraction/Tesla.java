package day_53_Abstraction;

public class Tesla extends Car implements AutoPark, AutoPilot {

    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto parking " + getModel());
    }

    @Override
    public void selfDrive() {
        System.out.println("Self Driving " + getModel());
    }

    @Override
    public void start() {
        System.out.println("Starting " + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Self driving " + getModel());
    }

    @Override
    public void charging() {
        System.out.println("Charging " + getModel());
    }
}
