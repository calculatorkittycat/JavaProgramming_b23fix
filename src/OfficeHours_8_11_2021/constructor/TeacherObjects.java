package OfficeHours_8_11_2021.constructor;

public class TeacherObjects {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //no arg
        Teacher teacher1 = new Teacher("Abbos");
        //name parm
        Teacher teacher2 = new Teacher(34);
        // age parm
        Teacher teacher3 = new Teacher("Abbos",34);
        //age&name

    }
}
