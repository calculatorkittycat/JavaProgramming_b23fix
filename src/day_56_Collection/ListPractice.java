package day_56_Collection;

import day_54_recap.Inheritance;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {
        /**
         * The Integer class wraps a value of the primitive type int in an object.
         * An object of type Integer contains a single field whose type is int.
         */
        //Reference type <Object Type>
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.size();

        Vector<Integer> vector = new Vector<>();
        vector.size();

        Stack<Integer> stack = new Stack<>();
        vector.size();
        stack.addAll(Arrays.asList(1,2,3,4,5,6));
        //arrays.asList converts array to collection type

        System.out.println(stack);

        int a = stack.pop();
        System.out.println(a);

        System.out.println(stack);

        int b = stack.pop();
        System.out.println(b);

        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);



    }

    public void method1(){


    }

    public synchronized void method(){

    }

}
