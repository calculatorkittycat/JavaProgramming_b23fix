package Practice;

import java.util.Scanner;

public class PrintEvensArrayReplit {

    public static void main(String[] args) {
        System.out.println("Enter five numbers. the program will list the ammount of even numbers you entered");
        Scanner input = new Scanner(System.in);//initiates scanner
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),};
        //the above line will add 5 numbers into the array.

        int evenCount = 0; //this sets evencount with a default of 0
        for (int i = 0; i < nums.length; i++) { //for loop with range from position 0 in the array to end of array
            if (nums[i]%2==0)//if the numbers in the array from position 0 to end are divisible by 2 with remainder 0
                evenCount++;// add 1 to the evenCount
        }
        System.out.println("Even numbers " +evenCount);
    }
}
