package day_06;

public class Homework {

    public static void main(String[] args) {
        
        int a = 5;
            a = --a + a++ + a-- + a++;
         // 5 = 4   + 4   + 9   + 9
        System.out.println("a = " + a);
    }
}
