package day_48_review.cybertekTask;

import java.time.LocalDate;

public class Student extends Person{

    private String schoolName;
    private int iD;


    public Student(String name, char gender, LocalDate dOB, String schoolName, int iD) {
        super(name, gender, dOB);
        setSchoolName(schoolName);
        setiD(iD);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    public void attendClass(){
        System.out.println(getName() + " is attending class");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "schoolName='" + schoolName + '\'' +
                ", iD=" + iD +
                '}';
    }
}
