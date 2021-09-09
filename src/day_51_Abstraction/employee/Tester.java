package day_51_Abstraction.employee;

public class Tester extends Employee {

    public Tester(String name, char gender,double salary, long id) {
        super(name, gender, "Tester", salary, id);
    }

    @Override
    public void work() {
        System.out.println(name + " is testing software.");
    }

    public void testScripts(){
        System.out.println(getName() + " is executing test scripts.");
    }



}
