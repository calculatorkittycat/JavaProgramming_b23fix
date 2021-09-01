package Day_46_Inheritance.carTask;

public class Toyota extends Car { //is a relation

    static Boolean isReliable = true;

    public Toyota( String model, int year, double price, String color, long miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + model + " still running");
    }

    @Override
    public void start() {
        System.out.println("pump gas, turn key");
    }
}
