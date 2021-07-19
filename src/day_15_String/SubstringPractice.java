package day_15_String;

public class SubstringPractice {

    public static void main(String[] args) {

        String sentence = "My Favorite TV Series Is The Walking Dead";
        String tvSeries = sentence.substring(25);

        System.out.println(tvSeries);

        System.out.println("____________________________________________");

        String sentence2 = "Java is a fun language";
        String s1 = sentence2.substring(10, 13);
        System.out.println(s1);

        String s2 = sentence2.substring(14);
        System.out.println(s2);
    }
}
