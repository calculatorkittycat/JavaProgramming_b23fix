package OfficeHours_8_11_2021.constructor.statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

    public static int num;
    public static ArrayList<String> carModels;

    static{
        num= 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Volkswagen","Porsche","Studabaker","Honda"));

    }

    public StaticBlock(){
        System.out.println("no arg");
        num += 5;
    }

    public StaticBlock(int value){
        System.out.println("one para constr");
        num+=value;
    }

    }


