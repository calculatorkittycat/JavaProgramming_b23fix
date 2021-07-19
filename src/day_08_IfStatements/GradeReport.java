package day_08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {


        int score = 15;

        if (score >= 90 && score <= 100) {
            System.out.println("Excellent! You got an A");
        }

        if (score > 80 && score <= 90) {
            System.out.println("Good Job! You got a B");
        }
        if (score > 70 && score <= 80) {
            System.out.println("Not bad. You got a C");
        }
        if (score > 60 && score <= 69){

            System.out.println("Hmm. You got a D");
        }

        if (score <60){
            System.out.println("Fuck. You failed.");
        }



    }
}

/*
score

grade:
    A: 90 <= score <= 100
    B: 80 <= score <= 89
    C: 70 <= score <= 79
    D: 60 <= score <= 69
    F: score <60

 */
