package Practice;

import java.util.Scanner;

public class FindMaxReplit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),};
        int max = nums[0];// intiger variable named max equals nums at position 0, or default. initiated variable with temp value

        for (int i = 0; i < nums.length; i++) {//for loop from index 0 to the last index of nums
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);

    }

}
