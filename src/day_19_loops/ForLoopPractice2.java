package day_19_loops;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        //A~Z
        for (int i = 65; i<=90; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("Hello");

        System.out.println("___________________another way_____________________");
        for (char i = 'A'; i < 'Z' ; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("________________________backwards______________________");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i+" ");

        }
        System.out.println();

        System.out.println("______________________________lowercase_________________________");

        for (char i = 'z'; i >='a'; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("____________________________all chars from 1000 to 60000_________________");

        for (char i = 10000; i <= 60000 ; i++) {
            System.out.print(i+" ");

        }

    }
}
