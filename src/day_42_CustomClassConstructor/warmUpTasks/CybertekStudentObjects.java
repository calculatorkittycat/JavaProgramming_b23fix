package day_42_CustomClassConstructor.warmUpTasks;

public class CybertekStudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent("Ivan",31,'m');
        CybertekStudent student2 = new CybertekStudent("Navi",13,'m');

        System.out.println(student1);
        System.out.println(student2);

        student1.attendClass();
        student2.replit();

        student1.askForBreak();
    }
}
