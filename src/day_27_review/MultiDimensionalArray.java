package day_27_review;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        String[] scrum1 = {"Komiljon","Yuliang", "Merve", "Nadima"};
        //                    0         1
        String[] scrum2 = {"Sabir", "Tamara"};
        //                    0         1
        String[] scrum3 = {"Tugba", "Hilal", "Dilem"};
        //                    0         1        2
        String[][] scrumTeams = {scrum1, scrum2, scrum3};// length: 3
        //                         0        1       2

        System.out.println(Arrays.deepToString(scrumTeams));

        //String[] scrum1 = {"Komiljon","Yuliang", "Merve", "Nadima"};
        System.out.println(Arrays.toString(scrumTeams[0]));

        //Tamara
        System.out.println(scrumTeams[1][1]);

        System.out.println("______________________________________");

        for( String[] eachScrum  : scrumTeams ){
            System.out.println(Arrays.toString(eachScrum));
        }

        System.out.println("______________________________________");

        for( String[] eachScrum  : scrumTeams ){
            for (String eachMemeber : eachScrum){
                System.out.println(eachMemeber+" ");

            }
        }

        System.out.println("\n______________________________________");

        for (int i = 0; i < scrumTeams.length; i++) {
            for (int j = 0; j < scrumTeams[i].length; j++) {
                System.out.print(scrumTeams[i][j]+" ");
                System.out.println();
            }
        }

        System.out.println("______________________________________");

        int[] numbers = {1,2,3,4,5}; //5,2,3,4,1

        int temp = numbers[0];//1

        numbers[0] = numbers[4];//5,2,3,4,5
        numbers[4] = temp;//5,2,3,4,1

        System.out.println("numbers = " + Arrays.toString(numbers));



    }
}
