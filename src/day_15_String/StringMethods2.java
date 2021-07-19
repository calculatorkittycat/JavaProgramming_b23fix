package day_15_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String sentence = "Java Programming language";
        //index:           0123
        String name = sentence.substring(0, 3+1);

        System.out.println("name = " + name);

        String s2 = "Cybertek School";


        String name2 = s2 = s2.substring(0, 7+1);
        System.out.println("name2 = " + name2);

        System.out.println("____________________________");

        String sentence2 = "Java is a programming language";

        String name4 = sentence2.substring(10);
        System.out.println(name4);

        String name5 = sentence2.substring(10, 21);

        System.out.println(name5);


        System.out.println("____________________________");


        String sentence3 = "Python is an easy language";
        sentence3 = sentence3.replace("Python", "Java");

        System.out.println(sentence3);

        String sentence4 = "C# is a programming language, I like learning C#, C# is the best";
        sentence4 = sentence4.replace("C#" , "Java");

        System.out.println(sentence4);

        System.out.println("____________________________");

        String sentence5 = "Dogs are friendly, Dogs are loyal, I love Dogs";
        sentence5 = sentence5.replace("Dogs", "Cats");

        System.out.println(sentence5);

        System.out.println("____________________________");

        String str = "Batch 23";

        char ch1 = str.charAt(6);

        System.out.println("ch1 = " + ch1);

        
    }
}
