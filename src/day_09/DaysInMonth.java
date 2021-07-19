package day_09;

public class DaysInMonth {

    public static void main(String[] args) {
/*
  3. write a program that can find the number of days in a month (Assume that Feb has 28 days)
            Ex:
                month = 2

            output:
                    28 days

        Hints: you will need single if statements for:
              28 days: 2
              30 days: 4, 6, 9, 11
              31 days: 1, 3, 5, 7,8,10, 12
(edited)

8
 */

        int month = 7;

        boolean has28Days = month == 2;
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        //In order to have 30 days the days in month must be equal to April, june, november, september.
        boolean has31days = !has28Days && !has30days;

        if (has28Days){
            System.out.println("month number " + month + " has 28 days");
        }
        if (has30days){
            System.out.println("month number " + month + " has 30 days");
        }
        if (has31days){
            System.out.println("month number " + month + " has 31 days");
        }

    }
}

