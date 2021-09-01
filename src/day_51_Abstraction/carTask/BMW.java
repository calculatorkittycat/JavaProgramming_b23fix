package day_51_Abstraction.carTask;

public final class BMW extends Car{

    public BMW(String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    @Override
    public void start() {
            System.out.println("__________________");
            System.out.println("Call Mechanic");
            System.out.println("Oil Change");
            System.out.println("Compression Start");
            System.out.println("__________________");
        }
    }

