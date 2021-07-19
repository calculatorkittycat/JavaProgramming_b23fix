package day_21_while_loops;

public class BreakVsExit {
    public static void main(String[] args) {

        for(int i = 0; i<= 5; i++){// i:0,1,2,3,4

            if(i==3){
                //break;//Exits loop only, Will print "Batch 23"
                System.exit(0);//terminates the program, will not print "Batch 23"
            }
            System.out.println("Cybertek School");
        }

        System.out.println("Batch 23");
    }
}
