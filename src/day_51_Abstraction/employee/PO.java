package day_51_Abstraction.employee;

public class PO extends Employee{

    public PO(String name, char gender, double salary, long id) {
        super(name, gender, "PO", salary, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is keeping the product backlog organized");
    }
}
