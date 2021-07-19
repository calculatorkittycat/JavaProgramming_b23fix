package day_07;

public class MarketGroups {


    public static void main(String[] args) {
        int score = 42;
        // this variable is the students score
        /*
        earlyBirds: 50
        group1: 40 -49
        group2: 30-39
        angryBirds: < 30
         */

        // these boolean variable describe what category the students will be in based on the int variable "score"
        // the && is called and logic
        //<= less than
        //<= greater than
        boolean earlyBirds = score >=50 && score <=60;
        boolean group1 = score >=40 && score <= 49;
        boolean group2 = score >=30 && score <= 39;
        boolean angryBirds = score <= 30;

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("_______________________");
        int score1 = 39;

        boolean winners = score1 >= 40 && score1 <= 60;
        boolean mediums = score1 >= 29 && score1 <= 39;
        boolean loosers = score1 >= 0 && score1 <= 28;

        System.out.println("winners = " + winners);
        System.out.println("mediums = " + mediums);
        System.out.println("loosers = " + loosers);


    }

}
