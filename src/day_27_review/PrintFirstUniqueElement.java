package day_27_review;


public class PrintFirstUniqueElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 3, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8};
        int firstUnique = 0;

       /* for (int j = 0; j <= nums.length-1; j++) {//outer loop: for repeating the inner loop to find the frequency of every element

            int frequency = 0;
            for (int i = 0; i <= nums.length - 1; i++) {//inner loop: responsible for finding the frequency of one element
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }

            if(frequency == 1){
                firstUnique = nums[j];
                break;//makes sure only the first unique elements is returned from the loop
            }

        }
*/
//for each

        for ( int each : nums ) {//outer loop: for repeating the inner loop to find the frequency of every element

            int frequency = 0;
            for ( int element : nums ) {//inner loop: responsible for finding the frequency of one element
                if (element == each) {
                    frequency++;
                }
            }

            if(frequency == 1){
                firstUnique = each;
                break;//makes sure only the first unique elements is returned from the loop
            }

        }

        System.out.println("firstUnique = " + firstUnique);

    }
}

//write a program that can return the first unique element from the array