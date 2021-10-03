package day_58;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabbbccccdddddeeee";

        Map<String, Integer> frequencyOfChar = new LinkedHashMap<>();

        for (String each : str.split("")) {
                int f = Collections.frequency(Arrays.asList(str.split("")), each);
            frequencyOfChar.put(each, f );
        }
        System.out.println(frequencyOfChar);


        System.out.println("__________");
        ArrayList<Integer> list = new ArrayList<>(frequencyOfChar.values());
        Collections.sort(list);
        int second = list.get(list.size() -2);

        System.out.println(second);
        System.out.println("__________");

        for (Map.Entry<String, Integer> entry : frequencyOfChar.entrySet()) {
            if(entry.getValue() == second){
                System.out.println(entry.getKey());
            }
        }





    }




}

/*
str = "aabbbccccddddd"

{a=2, b=3 , c=4, d=5}


 */
