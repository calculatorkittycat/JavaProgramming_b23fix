package day_48_review.cybertekTask;

import java.time.LocalDate;

public class Teacher extends Employee{
    public Teacher(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + getName() + " is teaching");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle() + getName() + " is in a teacher meeting");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle() + getName() + " sleeps 5 hours");
    }
}
