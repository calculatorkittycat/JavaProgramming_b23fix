package day_36_ArrayLists;

import utilities.StringUtilities;

import javax.swing.plaf.basic.BasicListUI;
import java.util.ArrayList;
import java.util.Arrays;


public class Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,6,6,6,7,7,7,8,8) );

        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) %2 != 0){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("____________________");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 7, 7, 8, 8, 8));
        System.out.println(list2);
        //list2.removeIf( p -> p < 5 );//p is predicate it represent each element in the array. if p is less than 5 then remove it!
        list2.removeIf(p -> p % 2 != 0);
        System.out.println(list2);


        System.out.println("____________________");
        ArrayList<String> str1 = new ArrayList<>();
        str1.addAll(Arrays.asList("Hello", "Goodbye", "Hola", "Jumbo", "Adios", "Mahalo"));
        System.out.println(str1);

        str1.removeIf(p -> p.contains("a"));

        System.out.println(str1);

        System.out.println("____________________");


        ArrayList<String> words = new ArrayList<>();
        words.addAll( Arrays.asList( "Anna", "Racecar", "Level", "Java", "Python", "Cybertek", "Sabas", "Pop", "Kayak" ));

        System.out.println( words);

        words.removeIf( p -> StringUtilities.isPalindrome(p) ); //if the string is palindrome, then remove it from the arraylist

/*
        for (int j =0; j <= words.size()-1; j++) {
            String reverse = "";
            for(int i = words.get(j).length()-1; i >=0; i--){
                reverse += words.get(j).charAt(i);
            }
            boolean isPalindrome = reverse.equalsIgnoreCase(words.get(j));
            words.removeIf( p -> isPalindrome );
        }
*/

        System.out.println(words);






/*

        ArrayList<String> str2 = new ArrayList<>();
        str2.addAll(Arrays.asList("Anna", "Racecar", "level", "Java", "Python", "Cybertek", "Sabas", "pop"));
        System.out.println(str2);
        //str2.removeIf(p -> StringUtilities.isPalindrome(p) );//if array is palindrome it will remove it from variable str2

        for (int j = j; j <= str2.size(); j++) {
            String reverse = "";

            for (int i = str2.get(j) - 1; i >= 0; i--) {
                reverse += str2.get(j).charAt(i);
            }
        boolean isPalindrome = reverse.equalsIgnoreCase(each);
        str2.removeIf( p -> isPalindrome);



        }
        System.out.println(str2);

 */
    }
}
