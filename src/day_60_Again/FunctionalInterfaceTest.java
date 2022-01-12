package day_60_Again;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {

        //create a function that can merge two Strings

        StringsFunction mergeTwoStrings = (s1,s2) -> { return s1+s2; };

        System.out.println(mergeTwoStrings.function("Hello", " There"));


        //create a function that can return the longest string

        StringsFunction returnLongestString = (s1,s2) -> {

            if(s1.length() > s2.length() ){
                return s1;
            }else{
                return s2;
            }
        };

        String longest = returnLongestString.function("i ok in length", "but am the baus son");
        System.out.println(longest);


        //create a function that can return the initials of a person

        StringsFunction initials = (s1,s2) -> {

            String personsInitials = s1.toUpperCase().charAt(0)+"."+s2.toUpperCase().charAt(0)+".";
            return personsInitials;
        };

        System.out.println(initials.function("Ivan", "Cain"));

        System.out.println("______________");
        System.out.println();




    }
}
