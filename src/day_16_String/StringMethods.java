package day_16_String;

public class StringMethods {
    public static void main(String[] args) {

        String email = "Cybertek@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println(email);

String sentence = "C# is cool, C# is fun";
//sentence = sentence.replace("C#", "Java");
sentence = sentence.replaceFirst("C#","Java");
        System.out.println(sentence);

        System.out.println("_______________________________________________________");

        String sentence2 = "Java is a cool language";
        int indexOfFirstA = sentence2.indexOf("a");
        int indexOfSecondA = sentence2.indexOf("a ");
        int indexOfThirdA = sentence2.indexOf("a c");
        int indexOfFourthA = sentence2.indexOf("la")+1;
        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfFourthA);

        System.out.println("_______________________________________________________");

        String s2 ="      ";
        s2 = s2.trim();
        boolean r1 = s2.isEmpty();
        System.out.println("r1 = " + r1);

        System.out.println("_______________________________________________________");


        String str1 = "Cat";//in string pool
        String str2 = new String("Cat");//In head
        String str3 = new String("Cat");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));//equals method compares the visible text regardless of memory location

        System.out.println(str2 == str3); // == also comparts the memory location

            System.out.println("_______________________________________________________");


            String word1 = "Java";
            String word2 = "java";

            System.out.println(word1 == word2);// two different objects
            System.out.println(word1.equals(word2));// different case

            System.out.println(word1.equalsIgnoreCase(word2));//ignores case when comparing

    }
}
