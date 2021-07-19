package Practice;

public class GradeHomeWork {

    public static void main(String[] args) {
        grade(90);
    }
    public static void grade (int score){
        if (score >= 90 && score <= 100){
            System.out.println("grade = A");
        } else if (score >= 80) {
            System.out.println("grade = B");
        }else if (score >= 70) {
            System.out.println("grade = C");
        }else if (score >= 60) {
            System.out.println("grade = D");
        }else if (score >= 50) {
            System.out.println("grade = F");
        }else{
            System.out.println("Fail");
        }
    }
}
/*
calculate the garde of the student based on the score
 */
