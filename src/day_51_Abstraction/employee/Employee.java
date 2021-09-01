package day_51_Abstraction.employee;

public abstract class Employee {

    private String name;
    private char gender;
    private String jobTitle;
    private double salary;
    private long id;


    public Employee(String name, char gender, String jobTitle, double salary, long id) {
        setName(name);
        setGender(gender);
        setJobTitle(jobTitle);
        setSalary(salary);
        setId(id);
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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
        if(salary <= 70000){
            System.out.println(salary + " Salary to low. Fail...");
        }
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id <= 0){
            throw new RuntimeException("Cannot be less than equal to 0" + id);
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
