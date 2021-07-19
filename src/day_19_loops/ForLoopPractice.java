package day_19_loops;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();//to make sure the next print statement starts from a new line
        System.out.println("Hello");

        System.out.println("_______________________________all odd numbers to 100___________________");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();//to make sure next print statement starts from a new line

        System.out.println("_______________________________all odd number to 100 another way________________");

        for (int i = 1; i <= 100; i +=2){
            System.out.print(i+" ");
        }
        System.out.println();//to make sure next print statement starts from a new line

        System.out.println("________________________________all even number between 0 and 100_______________");

        for (int i = 1; i < 101 ; i++) {
            if (i % 2 == 0) { //if i can be divided by two with zero remainder
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("________________________________odds and evens___________________________");
        String odds = "";
        String evens = "";

        for (int i = 1; i < 101 ; i++) {
            if(i %2 != 0){
                odds += i+" ";
            }else{
                evens +=  i+" ";
            }
        }


        System.out.println("odds = " + odds);
        System.out.println("evens = " + evens);
        }



    }
