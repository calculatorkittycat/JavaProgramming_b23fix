package day_23_Arrays;

public class HighestAndLowestScores {

    public static void main(String[] args) {

        int[] scores = {85, 70, 95, 91, 100};
        //               0    1   2   3   4

        String[] names = {"mike", "adam", "tony", "john", "amy"};

        int maxScore = scores[0];
        String maxName = "";

        int minScore = scores[0];
        String minName = "";

        for (int i = 0; i <= scores.length -1; i++) {
            String eachName = names[i];//gets each name from the array names
            int eachScore = scores[i];//gets each score from the array scores

            if(eachScore > maxScore){//used for comparing the scores to assign the maximum score maxScore
                maxScore = eachScore;
                maxName = eachName;
            }
            if(eachScore < minScore){//used for comparing the scores to assign the minimum score to minScore
                minScore = eachScore;
                minName = eachName;
            }
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("maxName = " + maxName);
        System.out.println();
        System.out.println("minScore = " + minScore);
        System.out.println("minName = " + minName);
    }
}
