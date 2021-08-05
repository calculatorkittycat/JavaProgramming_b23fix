package day_40_Custom_Class_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlocks {

    public static int a;

    public static ArrayList<String> list = new ArrayList<>();
    //list.addAll(Arrays.asList("A","B","C"));

    static {
        list.addAll(Arrays.asList("A","B","C"));
    }

    /*
    public static void main(String[] args) {
        list.addAll(Arrays.asList("A","B","C"));
    }
     */

}
