package day_37_ArrayLists;

import utilities.StringUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {
    public static void main(String[] args) {

        String[] names ={"Bert", "Ernie", "Grover", "Big bird"};

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList(names));
        System.out.println(students);

        Collections.swap(students, 0,students.size()-1);

        System.out.println(students);

        System.out.println("___________________");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,4,5,5,6,6,7,8,9));

        int firstUnique = 0;
        for (Integer each : list) {
            if( Collections.frequency(list,each) == 1){
                firstUnique = each;
                break;
            }
        }
        System.out.println("firstUnique = " + firstUnique);

        System.out.println("___________________");
        String str = "AAABBBCCCDDEEE";
        String result = "";
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str.split("")));//add string to an array list

        for (String each : StringUtilities.removeDup(str).split("")) {
            int frequency = Collections.frequency(list2, each);
            result += each + frequency;
        }

        System.out.println(result);

        System.out.println("___________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

       // Collections.sort(numbers);//ascending order
       // Collections.reverse(numbers);//descending order

        int n = 5;
        for (int i = 0; i < n; i++) {
            numbers.removeIf(p -> p == Collections.max(numbers));
        }

        int fifthMaxNumber = Collections.max(numbers);

        System.out.println("fifthMaxNumber = " + fifthMaxNumber);





    }
}

/*
1. write a program that can swap the first and last elements of an ArrayList

2. write a program that can return the first unique elements of an ArrayList

3. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

4. Write a program that can return the nth largest number from an ArrayList of integers
 */