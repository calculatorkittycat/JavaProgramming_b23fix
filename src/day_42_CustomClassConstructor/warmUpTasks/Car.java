package day_42_CustomClassConstructor.warmUpTasks;

public class Car {

    public String make, model;
    public int year;
    public double price;
    public String color;

    public Car(String make){
        this.make = make;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }


    public Car(String make, String model, int year) {
        this(make,model);
        this.year = year;
    }

    public Car(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }

    public Car(String make, String model, int year, double price, String color) {
        this(make, model, year, price);
    }

    public Car(int year, double price, String color) {
        this(null,null,year,price,color);
    }

    public Car(int year, double price) {
        this(year,price,null);
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
