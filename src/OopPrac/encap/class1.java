package OopPrac.encap;

import java.sql.Array;
import java.util.Arrays;

public class class1 {

    private int num = 1;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

public static void staticMethod1(){

}

public void regularMethod(){

}

    public static void main(String[] args) {


        String[] arr = {"Ivan","Java","C#"};
        String[] arr2 = new String[arr.length];


        int j = 0;

        for (int i = arr.length-1; i >= 0 ; i--) {
            arr2[j++]=arr[i]; //at this point the array is reversed

//            for (int k = arr[i].length()-1; k >=0 ; k--) {
//                arr2[j++]=arr[i];
//            }
        }

        System.out.println(Arrays.toString(arr2));




    }
}