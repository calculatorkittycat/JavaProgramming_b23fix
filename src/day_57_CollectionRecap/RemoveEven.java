package day_57_CollectionRecap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveEven {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(10,10,10,9,11,8,12,7,14,15,6,5,4,3,2,1));//no dupes and sorted

        System.out.println(set);

        //make set iterable and assign it to a variable to re use it, make data type Integer
        Iterator<Integer> it = set.iterator();
        //iterator has the hasNext(); Method
       while( it.hasNext() ) {  //must be true to use next() method

          if( it.next() %2 ==0){
              it.remove();
           }
       }

        System.out.println("set = " + set);

        System.out.println("___________");//short way (remove if)

        Set<Integer> set2 = new TreeSet<>();
        set.addAll(Arrays.asList(10,10,10,9,11,8,12,7,14,15,6,5,4,3,2,1));

        set.removeIf( n -> n%2==0);//n for numbers in set, n represents it.next() in the first example



    }
}
