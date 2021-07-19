package day_14_recap;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many poeple do you live with?");
        int numberOfPeople = scan.nextShort();
        if(numberOfPeople >= 1){

}

        switch (numberOfPeople){
            case 1:
            case 2:
                System.out.println("lives with less than 3 people");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("lives with 3 - 6 people");
                break;

            default:
                System.out.println("lives with more than 6 people");



        }



}

    }

