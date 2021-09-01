package day_51_Abstraction.carTask;

public final class Toyota extends Car{


    public Toyota(String model, String color, int year, double price) {
        super("Toyota", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("__________________");
        System.out.println("Insert Key");
        System.out.println("Twist the ket to ignition");
        System.out.println("__________________");
    }
}
