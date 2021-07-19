package day_25_forEachLoop;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = { 1,2,3,4,5};
//                        0,1,2,3,4
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);

        }

        System.out.println("______________________________________");

        for( int each : numbers){// each: elements of the array
            System.out.println(each);
        }

        System.out.println("______________________________________");

        String[] names = {"bill", "joe", "john", "jeff", "jerry"};

        for( String each : names) {
            System.out.println(each);
        }


    }
}
