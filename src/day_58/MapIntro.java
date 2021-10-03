package day_58;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {


    public static void main(String[] args) {

        //String is the key
        //no duplicates in Hashmap
        //no order in HashMap
        //if want to retain insertion order use LinkedHashMap
        //1st data you supply is the key, second value is the value
        //key is case sensitive
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Selda",100000);
        employeeMap.put("Dilem",100000);
        employeeMap.put("Selda",110000);
        employeeMap.put("Mucahit",110000);
        employeeMap.put("John", 120000);

        System.out.println(employeeMap);
        int n1 = employeeMap.get("Mucahit");
        System.out.println(n1);

        System.out.println("___________");
        System.out.println(employeeMap);
        employeeMap.remove("John"); //when you call remove method you must remove by the key

        System.out.println(employeeMap);

        boolean r1 = employeeMap.containsKey("Muhtar"); //.contains returns boolean //false
        boolean r2 = employeeMap.containsKey("John");//false -john has already been removed
        boolean r3 = employeeMap.containsKey("selda");//returns false because values are case sensitve
        boolean r4 = employeeMap.containsKey("Selda");//true

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("___________");
        boolean r5 = employeeMap.containsValue(100000); //true
        boolean r6 = employeeMap.containsValue(200000); //false
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("___________");
        System.out.println(employeeMap); //{Dilem=100000, Selda=110000, Mucahit=120000}
        employeeMap.replace("Selda",120000);
        employeeMap.replace("Mucahit",employeeMap.get("Mucahit")+20000);
        employeeMap.replace("Selda",employeeMap.get("Selda")- 5000);

        System.out.println(employeeMap);

        System.out.println("___________");
        //get all the names not the salary from the map
        for (String eachName : employeeMap.keySet()) {
            System.out.println(eachName);
        }

        for (Integer value : employeeMap.values()) {
            System.out.println(value);
        }

        System.out.println("___________");
        employeeMap.put("Abbos", 115000);
        employeeMap.put("Yuliang", 120000);
        employeeMap.put("Feruza", 125000);
        employeeMap.put("Ahmet", 129000);
        employeeMap.put("Ismail", 111000);
        employeeMap.put("Zorana", 125000);
        employeeMap.put("Mehmet", 130000);
        employeeMap.put("Yuliia", 127005);
        employeeMap.put("Yasin", 130000);
        employeeMap.put("Meltem", 121000);
        employeeMap.put("Dilem", 150000);
        employeeMap.put("Davut", 123000);
        employeeMap.put("Ekaterina", 135000);
        employeeMap.put("Mehmut", 143000);
        employeeMap.put("Merve", 122000);
        employeeMap.put("Tamara", 133000);

        //iterate the keys only
        for (String eachKey : employeeMap.keySet()) {
            System.out.print(eachKey + " ");
        }

        System.out.println("___________");
        //iterate the values only

        for (Integer eachValue : employeeMap.values()) {
            System.out.println(eachValue);
        }

        //iterate the entries only (entries mean key and value both)

        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) { //uses inner interface of the map known as entry
            System.out.println(eachEntry);
        }

        //OR

        //once you have entrySet you can get either value or key using .getValue or .getKey
        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) { //uses inner interface of the map known as entry
            System.out.println(eachEntry.getKey() + " : " +eachEntry.getValue()); //to get each key and value separately
        }


        System.out.println("___________");
        System.out.println(employeeMap);
        System.out.println("___________");
        int max = Integer.MIN_VALUE;
        String name = "";

        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            String eachName = entry.getKey();
            Integer eachSalary = entry.getValue();
            if(eachSalary > max){
                max = eachSalary;
                name = eachName;
            }

        }
        System.out.println("max salary - " + name + " : " + max);




    }
}
