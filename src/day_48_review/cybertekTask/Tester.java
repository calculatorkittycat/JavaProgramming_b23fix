package day_48_review.cybertekTask;

import java.time.LocalDate;
//final keyword prevents this class from being inherited to another class
public final class Tester extends Employee{


    public Tester(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + getName() + " is testing");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle() + getName() + " is in a meeting");
    }
}
