package day_08_IfStatements;

public class SingleifStatementIntro {

    public static void main(String[] args) {

        String name = "Ivan";

        int score = 95;
        boolean pass = score >60;



        if(pass) { //if student passed the exam

            System.out.println(name + " Contrats you passed the exam");
        }

        if (!pass) { //if student failed the exam
            System.out.println(name + " Sorry your failed the exam");
        }



    }
}
