package day_35_arrays_list;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9) );


        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,2,3,4,5,6,7,8,9) //NO!
        list.addAll(numbers );
        list.addAll( Arrays.asList(10,11,12,13,14,15) );

        System.out.println(list);

        System.out.println("__________________________________________");
        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Jim", "Dwight", "Pam", "Kelly", "Creed"));

        System.out.println("students = " + students);

        students.removeAll(Arrays.asList("Jim", "Pam"));// removes whatever you place in the parenthesis

        System.out.println("students = " + students);

        System.out.println("__________________________________________");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,5,5,5) ) ;
        System.out.println("nums = " + nums);

        nums.removeAll(Arrays.asList(1));

        System.out.println("nums = " + nums);

        System.out.println("__________________________________________");

        ArrayList<Integer> nums2 = new ArrayList<>();

        nums2.addAll(Arrays.asList(1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,5,5,5));

        System.out.println("nums2 = " + nums2);

        nums2.retainAll(Arrays.asList(1,2));

        System.out.println("nums2 = " + nums2);

        System.out.println("__________________________________________");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Dwight","Angela","Kevin","Darrel","Michael"));

        System.out.println("employees = " + employees);

        employees.retainAll(Arrays.asList("Dwight", "Angela"));

        System.out.println("employees = " + employees);


        System.out.println("__________________________________________");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Soda","Kit-Kat","Sugar", "Sweet tarts", "Pop Tarts", "Fudge", "Cookies","Taffy", "Toffee"));

        //check if kit-kat, sugar, and toffee are contained in list
        boolean r = groceryList.containsAll(Arrays.asList("Kit-Kat", "Sugar", "Toffee", "Smellmo"));

        System.out.println("r = " + r);

    }
}
