package OfficeHours_8_11_2021.constructor;

public class StudentObject {

    public static void main(String[] args) {
        Student student = new Student("Golem");
        System.out.println(student);

        Student student1 = new Student("Yuliang", 25);
        System.out.println(student1);

        Student student2 = new Student("Ivana", 26,23);
        System.out.println(student2);
    }
}
