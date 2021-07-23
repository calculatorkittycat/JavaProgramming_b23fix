package day_35_arrays_list;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmupTask1 {

    public static void main(String[] args) {

        LocalDate[] dates = new LocalDate[10];//array with 10 elements containing local dates

        for (int i = 0; i < dates.length; i++) { // i is representing the index numbers
            dates[i] = LocalDate.now().plusDays(i);//i+1 excludes today's date// i+3  starts 3 days from now
            //when i is zero it starts on todays date, when i is one it goes to tomorrows date and so on
        }

        System.out.println(Arrays.toString(dates));//printing without line 12 and 13 will return null for all elements
        //    data type     / array
        for( LocalDate each : dates ){
            System.out.println(each.format(DateTimeFormatter.ofPattern("MMMM/dd, EEEE")));//Full month name, day number, full day name
        }




    }

}
