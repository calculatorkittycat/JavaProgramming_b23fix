package day_56_Collection;

import sun.java2d.pipe.AAShapePipe;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Book", "Pen", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon"};

        Set<String> items1 = new HashSet<>(Arrays.asList(arr));//asList converts to collection type
        items1.add(null);
        System.out.println(items1);

        Set<String> items2 = new LinkedHashSet<>(Arrays.asList(arr));
        items2.add(null);
        System.out.println(items2);

        Set<String> items3 = new TreeSet<>(Arrays.asList(arr));
        //items3.add(null); //TreeSet does no accept null, because it can not put null in order, it can not sort null.
        System.out.println(items3);

        //String str = null;
        //str.equals("Cybertek");

        System.out.println();
        System.out.println("_____________");
        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        list = new ArrayList<>(new LinkedHashSet<Integer>(list));

        System.out.println(list);

        System.out.println();
        System.out.println("_____________");
        System.out.println();

        String str = "abcabcabcabc";
        str =  new LinkedHashSet<>( Arrays.asList( str.split("")) ) .toString().substring(1).replace(", ", "").replace("]", "");

        
        //str =  new LinkedHashSet<>( Arrays.asList( str.split("")) ) .toString();
        System.out.println(str);
        System.out.println("_____________");
        System.out.println("_____________");

        Integer[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //returns 5th element after removing duplicates
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(nums));//now hash set contains non duplicated version
        System.out.println(linkedHashSet);
        //System.out.println(linkedHashSet.get(4));// set does not have index numbers
        System.out.println(new ArrayList<>(linkedHashSet).get(4));


        System.out.println();
        System.out.println("_____________");
        System.out.println();


        //"aaaaabbbcccc" ===> "a4b3c4"

        String[] lettes = {"a", "a", "b", "b", "c", "c"};
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>(Arrays.asList(lettes));

        //Collections.frequency(linkedHashSet1,"a");
        //System.out.println(linkedHashSet1);

        for (String each : linkedHashSet1) {
            System.out.println(each + ": " + Collections.frequency(linkedHashSet, each));
        }


        System.out.println("______________________");
        String str1 = "aaaaabbbcccc";

        Set<String> str1UniqueSet = new LinkedHashSet<>((Arrays.asList(str1.split(""))));

        List<String> str1UniqueList = new ArrayList<>(str1UniqueSet);//unique elements as List

        System.out.println("str1UniqueList = " + str1UniqueList);

        List<String> str1List = new ArrayList<String>(Arrays.asList(str1.split("")));

        for (String each : str1UniqueList) {

            System.out.print(each + Collections.frequency(str1List, each));

        }
        System.out.println();
        System.out.println("__________");
        System.out.println();

        String s = "aaabbbcccdddee";
        String result = "";
        for (String ch : new LinkedHashSet<>(Arrays.asList(s.split("")))) { //ch : non-duplicated characters ==> a b c d e
            result += ch + Collections.frequency(Arrays.asList(s.split("")), ch);
        }
        System.out.println("result = " + result);





    }



}
