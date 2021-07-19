package day_09;

public class GradeReport {

    public static void main(String[] args) {

/*
	a: 90 - 100
	b: 80 - 89
	c: 70 - 79
	d: 60 - 69
	f:    < 60
 */

        int score = 5;

        if(score >= 90 && score >= 100){
            System.out.println("Your grade is: A");
        }else if(score >= 80 ){
            System.out.println("Your grade is: B");
        }else if(score >= 70){
            System.out.println("Your grade is: C");
        }else if (score >= 60){
            System.out.println("Your grade is D:");
        }else{
            System.out.println("Fail");
        }

    }
}
