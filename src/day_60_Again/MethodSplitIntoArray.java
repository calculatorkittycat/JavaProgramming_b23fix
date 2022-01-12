package day_60_Again;

import java.util.Arrays;

public class MethodSplitIntoArray {

    String[] splitter(String str){

        String[] arr = str.split(" ");

        return arr;
    }

    public static void main(String[] args) {

        String str = "hello java is cool";

        String[] arr = new MethodSplitIntoArray().splitter(str);

        System.out.println(Arrays.toString(arr));
    }
}
