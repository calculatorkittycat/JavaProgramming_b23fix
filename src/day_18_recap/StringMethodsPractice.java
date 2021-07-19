package day_18_recap;

import java.sql.SQLOutput;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String str = "abcd";
        int indexOfK = str.indexOf("k");
        System.out.println("indexOfK = " + indexOfK);

        if (indexOfK >= 0) {
            System.out.println("The string has a character of K");

        } else {
            System.out.println("The string does not have k");
        }
        System.out.println("_________________________________");

        String sentence = "I like to learn C#, C# is cool";

        if (sentence.indexOf("j") >= 0) {

    }else {
            System.out.println("Sentence does not have java");

            System.out.println("_________________________________");

            String sentence2 = "I love Java, Java is cool ";

            boolean isUnique = sentence2.indexOf("Java") == sentence2.lastIndexOf("Java");

            System.out.println("isUnique = " + isUnique);
        }

        System.out.println("_________________________________");
/*
        String schoolName = "Cybertek School";
        String name = schoolName.substring(0, schoolName.indexOf(" ") );

        System.out.println(name);

        String sentence3 = "I live in virginia, I go to cybertek school";
        String name2 = sentence3.substring( sentence3.indexOf("C"), sentence3.lastIndexOf(" "));

        System.out.println("name2 = " + name2);
*/

        System.out.println("_________________________________");


        String str2 = "Dog Cat Dog Cat";
        str2 = str2.replace("Cat","Dog");//Dog Dog Dog Dog
        System.out.println(str2);

        str2 = str2.replaceFirst("Dog","Cat");//Cat Dog Dog Dog
        System.out.println("str2 = " + str2);

        String sentence4 = "Java Java Java";
        //sentence4 = sentence4.replaceFirst("Java", "C#").replaceFirst(); // "C# Java Java

        sentence4 = sentence4.replace("Java Java", "C# Python");

        System.out.println("_________________________________");


        System.out.println( "Yes".equals("yes")); //False. different case

        System.out.println( "Yes".equalsIgnoreCase("yes")); //true

        System.out.println("yes".equalsIgnoreCase("no")); //false


        System.out.println("______________________________________");







    }
}
