package day_20_loops;

public class BranchingStatements {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            if(i==3){
                break;
            }

            System.out.println(i);





        }
        System.out.println("_____________________________________");

        for (int i = 0; i < 5; i++) {


            if(i == 3){
                continue;//skip
            }
            System.out.println(i);
        }
        System.out.println("_____________________________________");

        for (int i = 0; i < 10; i++) {

            if(i%2==0){//whenever the number is divisible by 2( even number )
                continue;//then the compiler will skip it. this will creat a printing of all the odd numbers between 1 and 10
            }

            System.out.println(i);

        }
        System.out.println("_____________________________________");

        for (int i = 0; i < 100; i++) {

            if(i% 15 !=0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("_____________________________________");

        for (char i = 'A'; i <= 'Z'; i++){

            if(i == 'D' || i == 'T' || i == 'X'){
                continue;
            }
            System.out.print(i+" ");

        }


    }
}
