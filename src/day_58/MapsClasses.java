package day_58;

import java.util.*;

public class MapsClasses {


    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); //accepts null //random order
        hashMap.put(null,null);
        System.out.println("hashMap = " + hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); //accepts null // insertion order
        linkedHashMap.put(null,null);
        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(); //does not accept null // ascending order
        treeMap.put(null,null);
        System.out.println("treeMap = " + treeMap);

        Map<String, Integer> hashTable = new Hashtable<>(); //does not accept null //random order, synchronized
        hashMap.put(null,null);
        System.out.println("hashTable = " + hashTable);








    }
}
