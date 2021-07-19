package day_24;

public class Grade {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah", "Abbos", "Yuliang", "Raphael", "Tamerlan"};
        int [] scores = {90, 75, 80, 85, 92, 91, 93};
        char [] grades = new char[names.length];
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;



        for (int i = 0; i <= grades.length-1; i++) {

            int score = scores[i];
            if(score >=90){
                grades[i] = 'A';
                countA++;
            }else if(score >= 80){
                grades[i] = 'B';
                countB++;
            }else if(score >= 70){
                grades[i] = 'C';
                countC++;
            }else if(score >= 60) {
                grades[i] = 'D';
                countD++;
            }else{
                grades[i] = 'F';
                countF++;
            }


            /*grades[i] = (scores[i] >=90)? 'A' :( scores[i] >=80)? 'B' :(scores[i] >=70)? 'C' :(scores[i] >=60)? 'D': 'F';
             */
            System.out.println(names[i]+" : "+scores[i]+" : "+grades[i] );


        }



        System.out.println();
        System.out.println("countA = " + countA);
        System.out.println("countB = " + countB);
        System.out.println("countC = " + countC);
        System.out.println("countD = " + countD);
        System.out.println("countF = " + countF);

    }
}
/*
2. given the following arrays:
     String [] names = {"Anna", "Nancy", "Sarah"};
         int [] scores = {90, 75, 80};
         char [] grades = new char[names.length];

         write a program that can store the gardes of the students in the array named grades

 */