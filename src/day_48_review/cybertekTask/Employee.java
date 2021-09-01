package day_48_review.cybertekTask;

import java.time.LocalDate;

public class Employee extends Person{

    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB);
        setEmployeeId(employeeId);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //declared as instance because later on multiple copies will be needed
    public void work(){
        System.out.println(getName() + " is working");
    }
    //this is a method
    public void attendMeeting(){
        System.out.println(getName() + " is attending a meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+//including parents toString
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
