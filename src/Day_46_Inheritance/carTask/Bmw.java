package Day_46_Inheritance.carTask;

public class Bmw extends Car {

    public static boolean isFast = true;

    public Bmw( String model, int year, double price, String color, long miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void fast(){
        System.out.println(brand + model + " is hauling ass");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic");
    }
}
