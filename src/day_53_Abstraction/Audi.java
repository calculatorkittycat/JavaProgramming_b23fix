package day_53_Abstraction;

public class Audi extends Car implements AutoPark{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {

        System.out.println("Starting audi" + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving audi " + getModel());
    }

    @Override
    public void autoPark() {
        System.out.println("Autoparking audi" + getModel());
    }
}
