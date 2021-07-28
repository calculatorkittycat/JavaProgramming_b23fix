package Practice;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,5,0,-1,30,40,15));


        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.swap(list, 0,2);
        System.out.println(list);

        Collections.replaceAll(list, 10, 1000);
        System.out.println(list);

       int f =  Collections.frequency(list, 1000);
        System.out.println(list);

        System.out.println("_______________");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','A','B','C','C','C','D'));

        /*
        for (Character each : chars){
            if(Collections.frequency(chars, each) == 1){
                uniques.add(each);
            }
        }

 */

        ArrayList<Character> uniques = new ArrayList<>(chars);
        uniques.removeIf(p -> Collections.frequency(uniques, p) != 1);

        System.out.println(uniques);

        System.out.println("_______________");

        String str = "ABABABCDEEEE";
        String unique = "";
        ArrayList<String> result = new ArrayList<>(Arrays.asList(str.split("")));
        for(String each : result){
            if(Collections.frequency(result,each)== 1){
                unique += each;
            }
        }
        System.out.println(unique);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,9,9,8,7,6,5,4,3,2,1));
        //find 3rd max
        int firstMax = Collections.max(numbers);

        numbers.removeIf(p -> p == Collections.max(numbers));
        int secondMax = Collections.max(numbers);

        numbers.removeIf(p -> p == Collections.max(numbers));
        int thirdMax = Collections.max(numbers);



        System.out.println("firstMax = " + firstMax);
        System.out.println("secondMax = " + secondMax);
        System.out.println("thirdMax = " + thirdMax);



    }
}
