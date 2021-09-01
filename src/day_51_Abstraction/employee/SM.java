package day_51_Abstraction.employee;

public class SM extends Employee{

    public SM(String name, char gender, double salary, long id) {
        super(name, gender, "SM", salary, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is making things run smoove.");
    }
}
