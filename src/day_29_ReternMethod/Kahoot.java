package day_29_ReternMethod;

public class Kahoot {

    public static void main(String[] args) {

        char[] characters = {'a','b','c'};

        for( char each : characters){
            if ( each == 'b')
                continue;
            System.out.print(each + " ");

        }
    }
}
