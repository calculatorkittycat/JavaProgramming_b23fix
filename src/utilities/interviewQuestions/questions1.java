package utilities.interviewQuestions;

public class questions1 {

    public int maxValue(int[] n) {

        int max = Integer.MIN_VALUE; //min value of int or interger with is -billion something/ cant be zero if numbers
                                    //in array are less than 0
        //from primitive to wrapper class is autoboxing: is done implicitly
        //from object to primitive is unboxing: must be done with casting (explicitly)
        //this is neither of those

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }



    public static void main(String[] args) {

    /*
        Write a function that can find the maximum number from an int Array
     */

        int[] arr = {-1,-2,-3,-4,-5,-6,-15};

        questions1 questions1 = new questions1();

        System.out.println(questions1.maxValue(arr));


    }
}
