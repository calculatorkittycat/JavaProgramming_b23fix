package day_57_CollectionRecap;

import utilities.StringUtilities;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemovePalindrome {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Java", "Python", "Level", "Kayak",
                    "Cybertek", "Zaman", "Ana", "Batch 23"));

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String each = it.next();
            String reverse = "";
            for (int i = each.length()-1; i >= 0; i--) {
               reverse += each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }
        System.out.println(list);

        System.out.println("______________________________");
        List<String> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList("Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch 23"));

        list2.removeIf( p -> StringUtilities.isPalindrome(p));

        System.out.println(list2);
    }
}
