package day_53_Abstraction;

public class CarShow {

    public static void main(String[] args) {

        Honda honda =new Honda("Civic","dark blue",2018,19500);
        honda.drive();
        honda.start();


        Ford ford =new Ford("Mustang","black",2019,25800);
        ford.drive();
        ford.start();


        Porsche porsche=new Porsche("Cayman","red",2017,68000);
        porsche.autoPark();
        porsche.drive();
        porsche.start();


        Audi audi =new Audi("A8","white",2020,83400);
        audi.autoPark();
        audi.drive();
        audi.start();

        Tesla tesla =new Tesla("S","blue",2021,120000);
        tesla.autoPark();
        tesla.selfDrive();
        tesla.start();
        tesla.drive();


        Nio nio =new Nio("ET7","white",2020,68000);
        nio.charging();
        nio.drive();
        nio.start();
    }


}
