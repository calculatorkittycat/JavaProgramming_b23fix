package Practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
class Main{

    //create your method below
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> timesTwo = new ArrayList();
        for(Integer each : timesTwo ){
            each = Integer.valueOf(each)*2;
            timesTwo.addAll(Arrays.asList(each));
        }
        return timesTwo;
    }







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }

}