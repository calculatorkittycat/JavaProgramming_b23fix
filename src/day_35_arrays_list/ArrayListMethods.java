package day_35_arrays_list;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Cheese");
        groceryList.add("Biscuits");
        groceryList.add("Cereal");

        System.out.println(groceryList);
        System.out.println();

        groceryList.set(0, "Coffee");
        groceryList.set(1, "Wheat");
        groceryList.set(2, "Ramen");
        groceryList.set(3, "Cookies");
        groceryList.set(4, "Meat");


        System.out.println(groceryList);

        System.out.println("________________________________________________");

        groceryList.remove(0);
        groceryList.remove(1);
        groceryList.remove(2);

        System.out.println(groceryList);

        boolean r1 = groceryList.remove("Cookies");
        System.out.println(groceryList);
        System.out.println("r1 = " + r1);

        boolean r2 = groceryList.remove("Goggles");
        System.out.println("r2 = " + r2);

        System.out.println("________________________________________________");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        list1.remove(Integer.valueOf(30));
        //OR// list1.remove((Integer) 30);

        System.out.println(list1);
        list1.clear();

        System.out.println(list1);

        System.out.println("________________________________________________");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);

        list.indexOf('A');//0
        list.lastIndexOf('A');//4

        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (Character each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)) {
                uniqueChars.add(each);
            }

        }
        System.out.println("uniqueChars = " + uniqueChars);


        System.out.println("________________________________________________");


        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);

        ArrayList<Character> result = new ArrayList<>();// A,B,C

        for (Character each : characters) {
            if(result.contains(each)){
                continue;
            }else{
                result.add(each);
            }
        }

        System.out.println("result = " + result);

        System.out.println("________________________________________________");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        ArrayList<Integer> result2 = new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
          result2.add(nums.get(i)) ;           //400,300,200,100
        }
        System.out.println(result2);

        System.out.println("________________________________________________");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);

        System.out.println(n1 == n2);//compares
        System.out.println(n1.equals(n2));
    }
}
