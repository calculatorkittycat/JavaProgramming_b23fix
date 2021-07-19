package day_33_Methods;

import java.util.Arrays;

public class WarmupTask1 {

    public static void main(String[] args) {

        String[] students = {"lol", "wtf", "stfu", "lmao"};
        System.out.println("before reverse " + Arrays.toString(students) );
        students = reverse(students);
        System.out.println("After reverse " + Arrays.toString(students));
        System.out.println("_____________________________________");

        int[] numbers = {10,20,30,40,50};
        System.out.println("before reverse " + Arrays.toString(numbers) );
        numbers = reverse(numbers);
        System.out.println("after reverse " + Arrays.toString(numbers) );
        System.out.println("_____________________________________");

        char[] chars = {'Ä','Ü','§','æ'};
        System.out.println("before reverse " + Arrays.toString(chars) );
        chars = reverse(chars);
        System.out.println("after reverse " + Arrays.toString(chars) );
        System.out.println("_____________________________________");
    }

    //___________________________reverse int array............................................
    public static int[] reverse(int[] array){//{1,2,3,4,5} // i: starts last index to zero
        int[] result = new int[array.length];//{0,0,0,0,0} // j: 0 to last index

        for (int i = array.length-1, j= 0; i >= 0 ; i--, j++) {//decrease i because it is running backwards
            result[j] = array[i];
        }
        return result;
    }

    //___________________________reverse String array............................................
    public static String[] reverse(String[] array){//{1,2,3,4,5} // i: starts last index to zero
        String[] result = new String[array.length];//{0,0,0,0,0} // j: 0 to last index

        for (int i = array.length-1, j= 0; i >= 0 ; i--, j++) {//decrease i because it is running backwards
            result[j] = array[i];
        }
        return result;
    }

    //___________________________reverse double array............................................
    public static double[] reverse(double[] array){//{1,2,3,4,5} // i: starts last index to zero
        double[] result = new double[array.length];//{0,0,0,0,0} // j: 0 to last index

        for (int i = array.length-1, j= 0; i >= 0 ; i--, j++) {//decrease i because it is running backwards
            result[j] = array[i];
        }
        return result;
    }

    //___________________________reverse char array............................................
    public static char[] reverse(char[] array){//{1,2,3,4,5} // i: starts last index to zero
        char[] result = new char[array.length];//{0,0,0,0,0} // j: 0 to last index

        for (int i = array.length-1, j= 0; i >= 0 ; i--, j++) {//decrease i because it is running backwards
            result[j] = array[i];
        }
        return result;
    }
}

/*
Task 1:
    1. create a method that can reverse an array of integer

    2. create a method that can reverse an array of double

    3. create a method that can reverse an array of String

    4. create a method that can reverse an array of char
 */