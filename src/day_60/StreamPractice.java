package day_60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //multiple each of the odd numbers in this list by 2 and even by 3

        // list.stream().map( p -> {if(p%2!=0) return p*2; else return p*3;});
        list = list.stream().map( p -> (p%2!=0)?  p*2:  p*3).collect(Collectors.toList());

        System.out.println("list = " + list);

        System.out.println("__________");

        List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days.stream().map( p -> p.substring(0,3)  ).collect(Collectors.toList());

        System.out.println(days);

        System.out.println("__________");

        List<String> names = new ArrayList<>(Arrays.asList("java","python","ruby","sql","c#","c++","basic"));
        names = names.stream().map(p -> p.toUpperCase() ).collect(Collectors.toList());

        System.out.println(names);

        System.out.println("__________");

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,1,1,2,2,1,1,2,1,2,1,2,3,4,5,6,7));
        nums = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(nums);

        System.out.println("__________");

        Integer[] arr = {1,2,3,4,5,5,3,2,1,2,3,4,5,4,3,2,1,2,3,4,5,4,3,2,6};
        arr = Arrays.asList(arr).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println("__________");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,1,1,2,2,1,1,2,1,2,1,2,3,4,5,6,7));
        numbers = numbers.stream().distinct().filter( p -> p > 5).collect(Collectors.toList());
        System.out.println(numbers);

        System.out.println("__________");

        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("John Daniel","Jimmy Jon","James Bond","Breanna King","Shay King","Josh Bryan"));

        students = students.stream().distinct().map(p -> p.charAt(0) + "." + p.charAt(p.indexOf(" ")+1) ).collect(Collectors.toList());
        System.out.println(students);
    }
}
