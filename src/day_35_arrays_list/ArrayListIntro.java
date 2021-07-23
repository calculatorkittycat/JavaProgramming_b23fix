package day_35_arrays_list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    public static void main(String[] args) {
        int[] nums = new int[10]; //size is 10 and is fixed
        System.out.println(Arrays.toString(nums));
        System.out.println( "index 2" + nums [2]);

        ArrayList<Integer> numbers = new ArrayList<>(); //size is 0   //will not handle int. but will handles ints wrapper class Integer
        numbers.add(10);//0
        numbers.add(0,20);//1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(15);//adds at index 2
        numbers.add(20);

        System.out.println(numbers);
        System.out.println( numbers.get(2));//prints given index

        System.out.println("index size " + numbers.size());
        System.out.println();

        for (int i = 0; i <= numbers.size()-1 ; i++) {
            System.out.println( numbers.get(i));
        }
        System.out.println();

        for (Integer each : numbers) {
            System.out.println(each);
        }

    }


}
