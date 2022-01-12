package day_59;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {


    public static void main(String[] args) {


        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        System.out.println("-----------------------------------------------------");

        for (Map.Entry<String, LocalDate> stringLocalDateEntry : map.entrySet()) {
            System.out.println(stringLocalDateEntry);
            System.out.println("@@@@@@@@@@@@@@");
        }


        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            if(entry.getValue().isBefore(LocalDate.of(2015,1,1))){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("----------------------------------------------------");

        // display the name of the employee who were hired on 5/15/2020
        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            if(entry.getValue().equals(LocalDate.of(2020,5,15))){
                System.out.println(entry.getKey());
            }
        }

        System.out.println("------------------------------------------------");
        //How many people were hired after 2014?
         int count = 0;

        for (LocalDate hireDate : map.values()) {
            if(hireDate.getYear() > 2014){
                count ++;
            }
        }

        System.out.println("------------------------------------------------");
        // display the name and hire date of the employee (keySet() & get())

        for (String k : map.keySet()) {
            System.out.println( k + " : "+map.get(k));
        }




    }
}