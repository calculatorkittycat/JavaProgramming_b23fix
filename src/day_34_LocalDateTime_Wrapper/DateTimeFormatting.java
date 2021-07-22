package day_34_LocalDateTime_Wrapper;

import java.time.LocalDate;
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

    }
}



//MM/dd/YYYY