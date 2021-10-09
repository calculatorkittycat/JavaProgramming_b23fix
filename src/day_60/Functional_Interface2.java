package day_60;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

import static utilities.StringUtilities.isPalindrome;
import static utilities.StringUtilities.reverse;

public class Functional_Interface2 {

    public static void main(String[] args) {

        //create a function that can reverse a string
        Function<String, String> reverse = (s) -> new StringBuilder(s).reverse().toString();
        String str = reverse.apply("M KNIGHT");


        //create a function that can check if the string is palindrome
        Function<String, Boolean> isPalinDrome = s -> {
            String r = reverse.apply(s);
            return s.equalsIgnoreCase(r);
        };

        boolean r2 = isPalinDrome.apply("sRacecaRs");

        //create a function that can return the maximum number from array of integers
        Function<Integer[], Integer> maxNum = arr -> {
            Arrays.sort(arr);
        return arr[arr.length-1];
        };

        Integer[] arr = {1,2,3,4,5,56,6,73,7,138,3,3,83,8,2,8348,348,38,3};
        maxNum.apply(arr);


        //creare a functiont that canb return the maximim number from array list of integers
        Function<ArrayList<Integer>, Integer> maxNumFromArrayList = list -> {
            Collections.sort(list);
            return list.get(list.size()-1);
        };

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,72,23,42,34,2,5,23,623,56,2));
        maxNumFromArrayList.apply(list);

        System.out.println("__________");
        //forEach
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 95000);
        map.put("Jill", 100000);
        map.put("Jimbo", 105000);
        map.put("Jombo", 120000);
        map.put("Jettle", 115000);

        map.forEach( (k, v) -> {
            System.out.println(k + " : " + v);
        } );
        System.out.println("__________");
//same result from above and below
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("__________");
        //create a function that can repeat the given string for the given number of times
        BiConsumer<String, Integer> printMultipleTimes = (s,n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("java",5);
        //java, 3


    }
}
