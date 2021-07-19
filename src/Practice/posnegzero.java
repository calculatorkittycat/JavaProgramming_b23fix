package Practice;

import java.util.Scanner;

public class posnegzero {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if ( n > 0){
            System.out.println("POS");
        }else if ( n == 0 ){
            System.out.println("Zeor");
        }else{
            System.out.println("neg");
        }
    }
}
