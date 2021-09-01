package day_51_Abstraction.employee;

public class Teacher extends Employee{

    public Teacher(String name, char gender, double salary, long id) {
        super(name, gender, "Tester", salary, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching students.");
    }
}
