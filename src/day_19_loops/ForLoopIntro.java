package day_19_loops;

public class ForLoopIntro {

    public static void main(String[] args) {


        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        System.out.println("___________________________________________");
        //initialization condition and iterator
        for (int i = 1; i <= 5; i++) {//continues to repeat until the condition returns false, in this case 6
            System.out.println("Hello World");
        }
        System.out.println("__________________self practice_________________________");

        for (int i = 1; i <= 3; i++) {//continues to repeat until the condition returns false, in this case 6
            System.out.println("Wow wtf lol world");
        }


        System.out.println("___________________________increments of 2________________");
        //initialization condition and iterator
        for (int i = 1; i <= 5; i += 2) {//i : 1, 3, 5, 7
            System.out.println("Hello World");//2 times
        }

        System.out.println("___________________print 10 times______________");
        for (int i = 1; i <=10; i++ ) {
            System.out.println("HelloWorld10times");
        }
    }



    }


