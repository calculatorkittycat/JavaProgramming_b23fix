package day_15_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String str ="Muhtar";

        char ch = str.charAt(0);
        System.out.println("ch = " + ch);

        String word = "Cybertek School";
        char ch1 = word.charAt(0);
        System.out.println("ch1 = " + ch1);

        String word2 = "Java";
        char ch2 = word2.charAt(2);
        System.out.println("ch2 = " + ch2);
        System.out.println("__________________________________________");

String word3 ="Poindexter";
int totalNumberOfCharacters = word3.length();
        System.out.println(totalNumberOfCharacters);

        String s1 = "Cybertek School";
        int lastIndex = s1.length()-1;//in order to get the last index number subtract one from the length of the string
        char firstCharacter = s1.charAt(0);
        char lastCharacter = s1.charAt( lastIndex);
        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("_________________________________________");
        String firstName = "John";
        String lastName  = "King";

        String fullName = firstName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("fullName = " + fullName);
        System.out.println("fullName2 = " + fullName2);

        System.out.println("_________________________________________");

        String s = "cybertek";
            s = s.toUpperCase();

        System.out.println("s = " + s);

        System.out.println("_________________________________________");
        String s2 = "JAVA PROGRAMMING LANGUAGE";
        s2 = s.toLowerCase(Locale.ROOT);
        System.out.println(s2);

        System.out.println("_________________________________________");

        String name = "Ivan";//"Ivan"
        System.out.println(name);
        name = name.toUpperCase(); //"IVAN"

        System.out.println(name);

        name = name.toLowerCase(); //"ivan"

        System.out.println(name);

        System.out.println("_________________________________________");
        //Trim Method
        //Trim method removes the white space and returns the new string object

        String schoolName = "        Cybertonk Skewl";
        schoolName = schoolName.trim();
        System.out.println("schoolName = " + schoolName);

        System.out.println("_________________________________________");





    }
}
