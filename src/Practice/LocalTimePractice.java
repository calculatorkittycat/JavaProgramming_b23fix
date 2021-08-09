package Practice;

import day_34_LocalDateTime_Wrapper.DateTimeFormatting;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalTimePractice {


    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE:yyy:MMM");

        LocalDate DoB = LocalDate.of(1990,05,07);

        System.out.println(df.format(DoB));


    }
}
