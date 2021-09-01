package day_51_Abstraction.employee;

public class Developer extends Employee {

    public Developer(String name, char gender,  double salary, long id) {
        super(name, gender, "Developer", salary, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding.");
    }
}
