package day_30_Review;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};


        for (int each : numbers) {
            System.out.println(each);
        }

        System.out.println("_______________________________________________");
        
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            /*
            if(number > max){
                max = number;
            }
             */

            max = Math.max(number, max); // returns the maximum number between two numbers
            min = Math.min(number, min);//which ever is smaller it will return that number
        }

        System.out.println("max = " + max);

        System.out.println("_______________________________________________");

        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(4,2));


        System.out.println("_______________________________________________");

        String[] group1 ={"Sophie", "Feruza", "Ekaterina"};
        String[] group2 ={"Shazia", "Bilguun", "Danka", "Mucahit"};

        String[] group3 = new String[group1.length + group2.length];

        int i = 0;

        for (String name : group1) {
            group3[i++] = name;
        }
        for (String name : group2) {
            group3[i++] = name;
        }

        System.out.println(Arrays.toString(group3));
        System.out.println(i);



    }



}
