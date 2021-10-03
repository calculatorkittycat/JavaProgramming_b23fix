package day_58;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {

        String[] familyMember = {"John","Kevin","Lik"};
        //string array of names
        LocalDate[] DOBFamilyMember = {LocalDate.of(1992,01,02),LocalDate.of(1993,01,03),LocalDate.of(1994,01,04)};
        //locale date arrazy of birthdays

        String[] classMates = {"Jerry","Karim","Merk","Clark"};

        LocalDate[] DOBClassMates = {LocalDate.of(1995,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};



        String[] friends = {"Erik","Kahri","Morh","Jonny"};

        LocalDate[] DOBFriends = {LocalDate.of(1997,01,05),LocalDate.of(1995,01,06),LocalDate.of(1996,01,07),LocalDate.of(1997,01,8)};



        List<Map<String, LocalDate>> listOfMap = new ArrayList<>();
        //mew list of maps. maps contain key and value

        listOfMap.addAll(Arrays.asList(
                new HashMap<>(), // family members & their DoB
                new HashMap<>(), // class mates & their DoB
                new HashMap<>() /// friends & their DoB
        ));
        //adding 3 new maps to the list of maps

        System.out.println("__________");
        //add family members & their DoB into the first Map of ListOfMap

        for (int i = 0; i < familyMember.length; i++) {//using length of fam member array as iteration limit
            listOfMap.get(0).put( familyMember[i], DOBFamilyMember[i] ); //using.out method to populate map 0

        }

        System.out.println("__________");
        for (int i = 0; i < classMates.length; i++) {
            listOfMap.get(1).put( classMates[i], DOBClassMates[i] );

        }

        System.out.println("__________");
        for (int i = 0; i < friends.length; i++) {
            listOfMap.get(2).put( friends[i], DOBFriends[i] );

        }
        System.out.println("__________");
        System.out.println("listOfMap = " + listOfMap);

        System.out.println("__________");
        //print the name of the people who were born between 1995 and 1997

        for (Map<String, LocalDate> map : listOfMap) {
            for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
                int birthYear = entry.getValue().getYear();
                if(birthYear >= 1995 && birthYear <= 1997){
                    System.out.println(entry.getKey() + " " + birthYear);
                }
            }
        }



        String s1 = "schoolbus";
        String reverse = "";

        for (int i = s1.length()-1; i >=  0 ; i--) {

           reverse += "" + s1.charAt(i);

        }
        System.out.println(reverse);

    }
}