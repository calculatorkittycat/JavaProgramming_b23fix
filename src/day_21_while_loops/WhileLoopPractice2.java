package day_21_while_loops;

public class WhileLoopPractice2 {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");


            }
            i++;
        }
        System.out.println();
        System.out.println("________________________________");
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");

            }
        }
    }
}
