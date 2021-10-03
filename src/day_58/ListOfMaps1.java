package day_58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ListOfMaps1 {

    public static void main(String[] args) {

        Map<String, String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Elza","SDET");
        scrum1.put("Mehmet","Developer");
        scrum1.put("Stefan","Developer");
        scrum1.put("Rishat","PO");
        scrum1.put("Ismail","SM");
        scrum1.put("Tamara","SDET");
        scrum1.put("Adnan","QA");
        scrum1.put("Ibrahim","Developer");
        scrum1.put("Mehmut","QA");

        Map<String, String> scrum2=new LinkedHashMap<>();
        scrum2.put("Yahya","SDET");
        scrum2.put("Ahmet","Developer");
        scrum2.put("Gulistan","Developer");
        scrum2.put("Ahmad","PO");
        scrum2.put("Aykut","SM");
        scrum2.put("Nazli","SDET");
        scrum2.put("Kadir","Teser");
        scrum2.put("Igor","Developer");
        scrum2.put("Saron","Tester");
        scrum2.put("Jonathan","BA");
        scrum2.put("Feruza","Tester");

        Map<String, String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Oz", "PO");
        scrum3.put("Yuliang", "BA");
        scrum3.put("Oleg", "Developer");
        scrum3.put("Ivan", "Developer");
        scrum3.put("Andrei", "Developer");
        scrum3.put("Dontrell", "Developer");
        scrum3.put("Bakhtiyar", "Developer");
        scrum3.put("Farhad", "Tester");
        scrum3.put("Davut", "Tester");
        scrum3.put("Nasratullah", "Tester");

        Map<String,String> scrum4=new LinkedHashMap<>();
        scrum4.put("Ivana","SM");
        scrum4.put("Katya","Developer");
        scrum4.put("Jenna","Developer");
        scrum4.put("Zaid","PO");
        scrum4.put("Nate","SM");
        scrum4.put("Zully","SDET");
        scrum4.put("Dilem","Teser");
        scrum4.put("Alex","Developer");
        scrum4.put("Ha","Tester");

        Map<String, String> scrum5 = new LinkedHashMap<>();

        ArrayList<Map<String, String>> employees = new ArrayList<>();  // now this array list can store arraylists of maps that have maps as key and maps as value
        employees.addAll(Arrays.asList(scrum1,scrum2,scrum3,scrum4,scrum5));


        for (Map<String, String> eachMap : employees) {
            for (Map.Entry<String, String> entry : eachMap.entrySet()) {
                if(entry.getValue().equals("SM")){
                    System.out.println(entry.getKey()+ " " + entry.getValue());
                }
            }
        }

        System.out.println("__________");
        //print the name of the developers
        for (Map<String, String> eachMap : employees) {
            for (Map.Entry<String, String> entry : eachMap.entrySet()) {
                if(entry.getValue().equalsIgnoreCase("developer")){
                    System.out.println(entry.getKey()+ " " + entry.getValue());
                }
            }
        }

        System.out.println("__________");
        //print the names of the testers
        for (Map<String, String> eachMap : employees) {
            for (Map.Entry<String, String> entry : eachMap.entrySet()) {
                if(entry.getValue().equalsIgnoreCase("tester")){
                    System.out.println(entry.getKey()+ " " + entry.getValue());
                }
            }
        }
    }
}
