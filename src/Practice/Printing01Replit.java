package Practice;

import java.util.Scanner;

public class Printing01Replit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Initiates scanner
        String[] arr = new String[5];//sets up an array named arr with five blank or null indexes
        for (int i = 0; i < 5; i++)// for loop with range from 0 to 5
        {
            arr[i] = input.nextLine();// runs 5 times because of for loop. adds 5 string entries into the indexes of arr array
        }

        for (int i = 0; i < arr.length; i++) {//this for loop is getting the information from the newly stocked array from index 0 to the end. meaning all entries
            System.out.println(arr[i].substring(0,3));//this is printing the information from the array from each index. but using the substring method only
            //prints index 0 to 3 of the substring for instance if you entered hello you would get hel 0=h 1=e 2=l and 3 is left out


        }
    }
}
