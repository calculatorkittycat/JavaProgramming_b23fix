package day_51_Abstraction.employee;

public class Workplace {

    public static void main(String[] args) {

        Tester tester = new Tester("John",'m',60000,987654);

        tester.testScripts();

        System.out.println(tester);
    }


}
