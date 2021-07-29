package Practice;

import utilities.StringUtilities;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArraysListPractice {

    public static void main(String[] args) {
        /*
            1. write a program that can set the last element of the Integer arraylist to zero
                ex:
                    list = [1,2,3,4,5];
                    output: [1,2,3,4,0];
         */
        // .set
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list.set(list.size()-1,999);

        System.out.println(list);

        System.out.println("________________");
        /*
          2. write a program that can multiply each odd number by 2
          ex: list = [1,2,3,4,5];
          output: [2,2,6,4,10]
         */
        //.get .set
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,9,10,11,12,13,14,15,16,17,18));
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) % 2 != 0){//if i is odd
                list2.set(i, list2.get(i)*2);//multiply it by 2
            }
        }
        System.out.println(list2);

        System.out.println("________________");

        String[] arr1 = {"elmo", "smelmo", "bert", "ernie"};
        String[] arr2 = {"Big Bird", "Oscar ", "Grover"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr1));
        result.addAll(Arrays.asList(arr2));

        System.out.println(result);

        System.out.println("________________");

ArrayList<Integer> list3 = new ArrayList<>();
list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
        System.out.println(list3);
list3.removeIf(p -> p% 2 != 0);
        System.out.println("All even");
        System.out.println(list3);

        System.out.println("________________");

        ArrayList<String> str1 = new ArrayList<>();
        str1.addAll(Arrays.asList("elmo", "smelmo", "bert", "ernie"));
        System.out.println(str1);

        str1.removeIf(p -> p.contains("m"));

        System.out.println(str1);

ArrayList<String> words = new ArrayList<>();
words.addAll(Arrays.asList("Anna", "Racecar", "Level", "Java", "Python", "Cybertek", "Sabas", "Pop", "Kayak" ));

        System.out.println(words);

        words.removeIf( p -> !StringUtilities.isPalindrome(p));
        System.out.println(words);

        System.out.println("________________");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,10,5,0,-123,123,56,2,1,72347,80));

        System.out.println("Sorted");
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("Reversed");
        Collections.reverse(list1);
        System.out.println(list1);

        System.out.println("swapped");
        Collections.swap(list1, 0,2);
        System.out.println(list1);

        System.out.println("frequency of 80");
        int f = Collections.frequency(list1, 80);
        System.out.println(f);

        System.out.println("________________");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','A','B','C','C','C','D'));
        System.out.println("Occures once");
        System.out.println(chars);

        ArrayList<Character> uniques = new ArrayList<>(chars);
        uniques.removeIf(p -> Collections.frequency(uniques, p) !=1);

        System.out.println(uniques);

        System.out.println("________________");

        String str = "ABABABCDEEEE";
        System.out.println("Occures once from string");
        System.out.println(str);
        String unique = "";
        ArrayList<String> result1 = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : result1) {
            if(Collections.frequency(result1,each)==1){
                unique += each;
            }
        }
        System.out.println(unique);

        System.out.println("________________");
        System.out.println("min max *Collections");
        int max = Collections.max(list1);
        int min = Collections.min(list1);
        System.out.println(list1);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,9,9,8,7,6,5,4,3,2,1));

        int firstMax = Collections.max(numbers);

        numbers.removeIf(p -> p == Collections.max(numbers));
        int secondMax = Collections.max(numbers);

        numbers.removeIf((p -> p == Collections.max(numbers)));
        int thirdMax = Collections.max(numbers);

        System.out.println("firstMax = " + firstMax);
        System.out.println("secondMax = " + secondMax);
        System.out.println("thirdMax = " + thirdMax);

        System.out.println("________________");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeA = new ArrayList<>(scores);
        gradeA.removeIf(p ->! (p >= 90 && p <= 100));
        System.out.println("gradeA = " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(scores);
        gradeB.removeIf(p -> !(p >= 80 && p <= 89));
        System.out.println("gradeB = " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>(scores);
        gradeC.removeIf(p -> !(p >= 70 && p <= 79));
        System.out.println("gradeC = " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>(scores);
        gradeD.removeIf(p -> !(p >= 60 && p <= 69));
        System.out.println("gradeD = " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>(scores);
        gradeF.removeIf(p -> !( p >= 0 && p <= 59));
        System.out.println("gradeF = " + gradeF);















    }
}
