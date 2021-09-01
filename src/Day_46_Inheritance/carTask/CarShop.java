package Day_46_Inheritance.carTask;

public class CarShop {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Hilux",1978,5000,"Yellow",450000);
        Tesla tesla = new Tesla("Cyber Truck",2024,60000,"black",0);
        Bmw bmw = new Bmw("X6",2009,88888,"white",0);

        System.out.println(toyota);
        toyota.start();
        toyota.reliable();
        System.out.println(bmw);
        bmw.start();
        bmw.fast();
        System.out.println(tesla);
        tesla.autoPilot();
        tesla.start();


    }

}
