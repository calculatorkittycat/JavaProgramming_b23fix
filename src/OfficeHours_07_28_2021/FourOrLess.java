package OfficeHours_07_28_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {

    public static void main(String[] args) {

/*
Task 1: four or less

given an ArrayList of Strings, go through and read only the Strings that are 4 characters of less.

Take those Strings and put them into a different ArrayList

Ex:

Input:
"apples", "tree", "loop", "cat", "animal", "shortcut"

Output[tree, loop, cat]
 */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        ArrayList<String> newList = new ArrayList<>();
        //Option 1
        for (String each : list) {
            if(each.length()>= 4)
                newList.add(each);
        }
        System.out.println(newList);

        //Option 2

        list.removeIf(p -> p.length()>4);
        System.out.println(list);





    }
}
