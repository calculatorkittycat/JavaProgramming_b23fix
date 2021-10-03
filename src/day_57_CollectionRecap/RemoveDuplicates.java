package day_57_CollectionRecap;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9));

        //convert one collection type to another
        //list contains duplicates
        //but linkedHashSet does not

        //must pass collection type "list"
         //list =new ArrayList<>(new LinkedHashSet<>(list)) ; //
        list =new ArrayList<>(new TreeSet<>(list)) ; //turn to tree set to arrange in ascending order
        System.out.println(list);

        System.out.println("__________");
        //convert from one data structure to another
        //collection type to array

        Integer[] nums = {1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9};// remove duplicates from array and return array, not collection type

        //convert collection type to array data structure
        nums = new TreeSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));

        System.out.println("__________");

        String[] students = {"Feruza", "Sabir", "Mucahit", "Ismail"};
        //add one more student to this array

        ArrayList<String> l = new ArrayList<>(Arrays.asList(students)); //convert array to collection type by creating new array list and adding as.list
        l.add("Esraa");
        //l.toArray();
        l.toArray(new String[0]);
        //System.out.println(l);
        System.out.println(Arrays.toString(students));







    }
}
