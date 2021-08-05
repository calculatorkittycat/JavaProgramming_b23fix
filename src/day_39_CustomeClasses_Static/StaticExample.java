package day_39_CustomeClasses_Static;

class CybertekStudent{
    public String name, gender;
    public int age, ID;

    public String SchoolName;
}




public class StaticExample {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        student1.SchoolName = "CyberTek Schoool";

        System.out.println(student1.SchoolName);

        CybertekStudent student2 = new CybertekStudent();
        CybertekStudent student3 = new CybertekStudent();
        CybertekStudent student4 = new CybertekStudent();

        System.out.println(student2.SchoolName);
        System.out.println(student3.SchoolName);
        System.out.println(student4.SchoolName);


    }
}
