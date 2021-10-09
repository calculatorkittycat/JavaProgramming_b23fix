package day_60;

import java.util.List;

public class FunctionalInterfaceTest {
//faster, less memory is functional interface
    public static void main(String[] args) {
        //create a function that can merge two strings
        StringsFunction mergeTwoStrings = (s1,s2) -> { return s1+s2; };

        String word1 = "Wooden";
        String word2 = "Spoon";

        String result1 = mergeTwoStrings.function(word1,word2);

        System.out.println("result1 = " + result1);


        //create a function that can return the longest string

        StringsFunction longestString = (f, s) -> {
            if(f.length()> s.length()){
                return f;
            }else{
                return s;
            }
        };


        String result2 = longestString.function("Cybertek", "Cydeo");
        System.out.println("result2 = " + result2);

        //create a functiont that can return the initials of a person

        StringsFunction initials = (f, l) ->  f.charAt(0) + "." + l.charAt(0);

        String result3 = initials.function("Ivan", "Cain");

        System.out.println("result3 = " + result3);

        System.out.println("__________");

        DataFunction<String> reverseString = (s) -> new StringBuilder(s).reverse().toString();

        String result4 = reverseString.accept("SchoolBus");

        System.out.println("result4 = " + result4);

        //create a function that can return the first three characters of the string

        DataFunction<String> firstThree = s -> s.substring(0,3);

        String result5 = firstThree.accept("Chocolate");
        System.out.println("result5 = " + result5);

        //create a function that can return the cube of an integer

        DataFunction<Integer> cubed = (n) -> n*n*n;
        int c1 = cubed.accept(80);

        System.out.println("c1 = " + c1);





    }
}
