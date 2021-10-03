package day_57_CollectionRecap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemovePalindrome2 {

    public static void main(String[] args) {

        //List of String
        //When List is reference type, object type can be ArrayList, Linked List, Vector and Stack.
        //ArrayList has the fastest performance for retrieving data
        //Linked list has the fastest performance for adding and removing because it is doubly linked
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("Java", "Python", "Level", "Kayak", "Cybertek", "Zaman", "Ana", "Batch 23"));

        // in order to execute removal from a collection type you must use iterable
        // Every collection type has the iterator method
        // The iterator interface is only applicable to things that are iterable
        // The return type of iterator method is the iterable interface
        // To reuse the iterator you can assign it back to a variable of data type Iterator
        // Since each object in the List is String you must give the same object type String
        Iterator<String> it = list.iterator();
        // The iterator now contains all elements from the list

        // There is a boolean return method in iterator know as hasNext
        // hasNext automatically becomes false after there are no more elements that can be iterated
        while (it.hasNext()) {// This loop will automatically become false as soon as all the elements in the list are iterated
            // And if the condition is true that means there is an object
            // To gain access to that object the .next method must be used.
            String each = it.next(); // This loop is how you can gain access to each of the String objects in the list

            String reverse = ""; // This 'reverse' string will hold the reversed version of each string in the list
            // To do this each String in the list must be iterated from last index to 0 and concatenated into the string 'reverse'

            //initialization        ; condition
            for (int i = each.length()-1; i >= 0; i--) {// To reverse each string you must have a loop
                // The initialization of the loop should start from the last index of the current string
                // To reach the last index of the string you must call .length() and subtract 1
                // The loop must stop when it reaches zero, zero is the index of the first character in the string
                // while the index number of the character in the string is greater than or equal to zero the loop will continue to iterate
                // Since the loop is beginning with with the last index  and ending on the first index the iterator must be set to decrease
                // Now each time this loop iterates it will start at the last index number and decrease by 1

                reverse += each.charAt(i); //Using .charAt() method with i as the argument will get each character of the string
                // each character must be concatenated into the string 'reverse'

                // Now you have the original String object (each) and the reversed version of that String object (reverse)

            }//this is the condition for a palindrome
            if (each.equalsIgnoreCase(reverse)) {// If the original String (each) is equal (ignoring case) to the reverse of that string, Then it is a palindrome
                it.remove();//to remove the palindromes from the list you must call the remove method from the Iterator interface
            }   //This is the point of calling the iterator method from the list class, so that you will be able to remove specific objects from a collection type
            //If the String is palindrome it will be removed from the iterator, if it is removed from the iterator it will also be removed from LinkedList Object



        }
        System.out.println(list);

        List<String> list2 = new LinkedList<>();
        list.addAll(Arrays.asList("Java", "Python", "Level", "Kayak",
                "Cybertek", "Zaman", "Ana", "Batch 23"));

        Iterator<String> it1 = list.iterator();

        while(it.hasNext()){
            String each = it1.next();
            String reverse = "";
            for (int i = each.length()-1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }
        System.out.println(list2);
    }
}
