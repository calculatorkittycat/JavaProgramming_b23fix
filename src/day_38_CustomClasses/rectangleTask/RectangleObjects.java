package day_38_CustomClasses.rectangleTask;

import day_38_CustomClasses.rectangleTask.Rectangle;

import java.util.Arrays;

public class RectangleObjects {

    public static void main(String[] args) {
        //w20, l30

       Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(30,20);
       //rectangle1.getInfo();
        System.out.println(rectangle1);

        System.out.println("___________________");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(99.9,66.6);
        //rectangle2.getInfo();
        System.out.println(rectangle2);

        System.out.println("___________________");

        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println("___________________");

        Rectangle[] arr= {rectangle1,rectangle2};

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println(Arrays.toString(arr));



    }
}
