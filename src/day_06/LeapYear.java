package day_06;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2023;
        int year2 =2000;
        int year3 = 2089;
        int year4 = 1516;

        boolean leapYear = year%4 == 0;


        //if the year is evenly divisible by 4 than it is a leap year

        System.out.println(year + " is a leap year: " + leapYear);



        //2. create a class named LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        //        Ex:
        //                year = 2020
        //
        //            output:
        //                2020 is leap year: true
        //
        //        Hint: if the number of years can be evenly divisible by 4, it's known as the leap year
    }
}
