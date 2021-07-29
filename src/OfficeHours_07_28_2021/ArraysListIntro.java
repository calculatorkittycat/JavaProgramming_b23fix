package OfficeHours_07_28_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListIntro {
    public static void main(String[] args) {

        ArrayList<String> cities =new ArrayList<>();

        //add(Object): adds the elements to the indexes of arrayList
        System.out.println(cities);
        cities.add("London");
        cities.add("Denver");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");

        System.out.println(cities);

        //add(index, Object): adds the element to the given index(index must exist)
        //Pushes all the other indexes forward
        cities.add(0,"Vienna");

        System.out.println(cities);

        //get(index): returns the element at given index

        System.out.println("cities.get(0) = " + cities.get(0));

        // set(index, Object: replaces the old element at the given index with new element

        System.out.println("cities.set(0,\"Miami\") = " + cities.set(0, "Miami"));
        //returns the element at the previously specified position
        System.out.println("cities.get(0) = " + cities.get(0));
        //you must do this to see the new element in the specified position

        //indexOf(object): returns the first matching objects index number

        System.out.println("cities.indexOf(0) = " + cities.indexOf(0));

        //size(): returns the total number of elements

        System.out.println("cities.size() = " + cities.size());

        //remove(index): removes the object at the giver index

        System.out.println("cities.remove(0) = " + cities.remove(0));
        System.out.println("cities = " + cities);

        //remove(object): removes the first matching object

        System.out.println("cities.remove(\"London\") = " + cities.remove("London"));
        System.out.println("cities = " + cities);

        //Bulk Op.

        //removeAll() : to remove multiple elements

        cities.removeAll(Arrays.asList("Paris", "Istanbul"));
        System.out.println("cities = " + cities);

        //retainAll() : to retain multiple elements

        cities.add("Paris");
        cities.add("Istanbul");
        cities.retainAll(Arrays.asList("Paris", "Istanbul"));

        System.out.println("cities = " + cities);

        //removeIf() : removes element according to condition

        cities.removeIf(p -> p.length()>6 );
        System.out.println("cities = " + cities);

        //clear(): removes all the objects from the list

        cities.clear();
        System.out.println("cities = " + cities);

        //isEmpty(): returns true if the list contains no elements

        boolean b1 = cities.isEmpty();

        System.out.println("b1 = " + b1);

        //isEmpty(): with ternary

        System.out.println(cities.isEmpty()?"list is empty": "list is full");

        //or you can find out if empty using size method

        System.out.println(cities.size()==0?"list is empty" : "list is full");



    }
}
