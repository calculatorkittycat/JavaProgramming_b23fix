package day_51_Abstraction.carTask;

public class CarObjects {

    public static void main(String[] args) {

        Tesla tesla = new Tesla("Model X","black",2020,60000);
        BMW bmw = new BMW("M4","Red",2019,50000);
        Audi audi = new Audi("Quattro","White",1988,20000);
        Toyota toyota = new Toyota("Hilux","Yellow",1978,10000);

        System.out.println(tesla);
        tesla.start();
        System.out.println(bmw);
        bmw.start();
        System.out.println(audi);
        audi.start();
        System.out.println(toyota);
        toyota.start();


        System.out.println("___________");

        Car[] cars = { toyota, audi, bmw, tesla };

    }
}
