package day_56_Collection;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Erjon", "Daniel", "Mustafa", "Mohammed"));
               // remove all the names "ahmed" without using removeIf



        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String each = it.next();
            if(each.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);
        System.out.println("______________________");

        List<String> names2 = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Erjon", "Daniel", "Mustafa", "Mohammed"));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));
        System.out.println(names);


        System.out.println("__________");

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(10,9,11,1,2,3,4,5,6,7,12,13,14,15,16,17,18));

        for( Iterator<Integer> i = set.iterator(); i.hasNext();){
            if(i.next() < 17){
                i.remove();
            }
        }
        System.out.println(set);


    }

}
