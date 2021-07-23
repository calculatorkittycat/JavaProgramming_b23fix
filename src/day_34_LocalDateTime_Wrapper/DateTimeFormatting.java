package day_34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {

    public static void main(String[] args) {

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY/EEEE");
        LocalDate today = LocalDate.now();

        System.out.println(today);

        today.format(DF);

        System.out.println(today.format(DF));

        System.out.println("______________________________________________");

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);
        System.out.println(currentTime.format(TF));

        LocalTime time1 = LocalTime.of(17,25);
        System.out.println(time1);

        System.out.println(time1.format(TF));

        System.out.println("______________________________________________");

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("YYYY/dd/MMMM/mm/hh/EEEE/a");

        LocalDateTime a = LocalDateTime.now();

        System.out.println(a.format(DTF));

        System.out.println("______________________________________________");

        /*
        1. use the LocalDate & Time get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
         */
        DateTimeFormatter format = DateTimeFormatter.ofPattern(("EEEE, hh:mm a, MMM/d/YYYY"));

        LocalDateTime time2 = LocalDateTime.of(2020,11,24,13,0);

        System.out.println(time2.format(format));


        // what day is 2022-01-01
        System.out.println();
        System.out.println("______________________________________________");
        String result = LocalDate.of(2022,7,5).format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println(result);

        System.out.println("______________________________________________");

        System.out.println(nameOfTheDay(1990,7,5));

    }

    public  static String nameOfTheDay(int year, int month, int day){
        String result = LocalDate.of(year,month,day).format(DateTimeFormatter.ofPattern("EEEE"));
        return result;
    }

}



//MM/dd/YYYY