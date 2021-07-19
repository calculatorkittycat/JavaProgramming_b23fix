package day_09;

public class PassOfFailed {

    public static void main(String[] args) {


        int score = 50;

        if (score >= 60) {
            System.out.println("Passed");
        }

        if (score <= 60){
            System.out.println("Failed");
        }


        System.out.println("__________________________");

        if (score >=60) {
            System.out.println("Passed");
        }else{// if it is something ELSE than greater than 60 print Failed
            System.out.println("Failed");
        }




    }
}
