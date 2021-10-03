package day_43_OOP_Encapsulation;

public class Test {

    public static void main(String[] args) {


        Circle circle = new Circle(3);
        Circle circle1 = new Circle(4);


        System.out.println(AccessModifiers.publicVariable);
        System.out.println(AccessModifiers.protectedVariable);
        System.out.println(AccessModifiers.defaultVariable);
        //System.out.println(AccessModifiers. privateVariable); //NO!


        System.out.println("_________________");
        EncapsulationIntro obj = new EncapsulationIntro();
        /*
        System.out.println(obj.userName);
        System.out.println(obj.password);

        obj.userName = "H";
        obj.password = "123";

        System.out.println(obj.userName);
        System.out.println(obj.password);
         */


        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());

        obj.setUserName("New");
        obj.setPassword("New");

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());

    }



}
