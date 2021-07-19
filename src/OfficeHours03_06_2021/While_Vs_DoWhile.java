package OfficeHours03_06_2021;

public class While_Vs_DoWhile {
    public static void main(String[] args) {

        //while is repeated if statement

        //Do while same as while but before condition we should make step/ statement at least one time



        int n = 10;

        do {
            //statements

            System.out.println("Do-while"); //will print even if the condition is false
        }    while(n<9);// the conditon goes later in the do while loop

        while(n<9){ //will not print if the condition is false
            System.out.println("While");
        }




    }
}
