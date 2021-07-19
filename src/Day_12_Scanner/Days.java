package Day_12_Scanner;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day of the week");
        int dayOfweek = scan.nextInt();

        System.out.println( (dayOfweek == 1)? "Monday" :(dayOfweek == 2)? "Tuesday" :(dayOfweek == 3)? "Wednesday"
        :(dayOfweek == 4)? "Thursday" :(dayOfweek == 5 )? "Friday" :(dayOfweek == 6)? "Saturday" : "Not Applicable" );
    }
}
