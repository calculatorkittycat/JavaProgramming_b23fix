package day_21_while_loops;

public class WhileLoopPractice {

    public static void main(String[] args) {

        String sentence = "Java is fun, Java is cool";
        //                "is fun, Java is cool"
        //                "is fun, is cool"


        int countJava = 0; //1

        while(sentence.contains("Java")){//if while loops returns false it will end the loop in this case when it runs out of "java"
            countJava++;
            sentence = sentence.replaceFirst("Java", "");
        }

        System.out.println("countJava = " + countJava);

    }
}
