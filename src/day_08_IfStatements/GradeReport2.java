package day_08_IfStatements;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 95;

        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >=80;//did not make A and scor eis greater than or equal to 80
        boolean madeC = !madeA && !madeB && score >=70;// did not make A or B and score is greater than 70
        boolean madeD = !madeA && !madeB && !madeC && score >= 60;
        boolean madeF = !madeA && !madeB && !madeC && !madeD;

        if(madeA) {
            System.out.println("You got an A");
        }
        if(madeB){
            System.out.println("You got a B");
        }
        if (madeC){
            System.out.println("You got a C");
        }
        if (madeD){
            System.out.println("You got a D");
        }
        if(madeF){
            System.out.println("You got an F");
        }


    }
}
