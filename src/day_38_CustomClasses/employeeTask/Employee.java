package day_38_CustomClasses.employeeTask;

public class Employee {

    public String name;
    public char gender;
    public int ID;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int ID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee Info: " +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
