package day_17_String;

public class StringMethods {
    public static void main(String[] args) {

        String sentence = "My favorite programming languages are : C#, Html, Java, JavaScript";
        boolean hasPython = sentence.contains("Python");
        boolean hasJava = sentence.contains("Java");
        //boolean hasJava2 = sentence.toLowerCase().contains("java");//how to ignore case while using compare

        System.out.println("hasPython = " + hasPython);
        System.out.println("hasJava = " + hasJava);

        System.out.println("______________________________________________");
        String sentence2 = "Cybertek School is the best";
        boolean startsWithCybertek = sentence2.startsWith("Cybertek");
        boolean startsWithSchool = sentence2.startsWith("School");

        System.out.println(sentence2);
        System.out.println("startsWithSchool = " + startsWithSchool);
        System.out.println("startsWithCybertek = " + startsWithCybertek);

        System.out.println("_______________________________________");

        String sentence3 = "Im an OG out her cuh";
        boolean endsWithCuh = sentence3.endsWith("cuh");
        boolean endsWithOG = sentence3.endsWith("OG");

        System.out.println(sentence3);
        System.out.println("endsWithOG = " + endsWithOG);
        System.out.println("endsWithCuh = " + endsWithCuh);

    }
}
