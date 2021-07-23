package day_34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDataPractice {

    public static void main(String[] args) {

        String[] students = {"Ahmad", "Gulistan", "Yahya", "Feruza", "Nazli"};

        LocalDate[] DOB = {
                LocalDate.of(1987, 10, 10),
                LocalDate.of(2000, 1, 1),
                LocalDate.of(1991, 1, 9),
                LocalDate.of(1993, 6, 17),
                LocalDate.of(1990, 3, 20)
        };

        LocalDate youngest = DOB[0];
        int index = 0;

        for (int i = 0; i < DOB.length; i++) {

            if (DOB[i].isAfter(youngest))
            youngest = DOB[i];
            index = i;
        }
        System.out.println("youngest = " + youngest);
        System.out.println(students[index]);

        System.out.println("____________________________________________");

        DateTimeFormatter DF = DateTimeFormatter.ofPattern("EEEE, MMM/dd/YYYY");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]+ " was born on " + DOB[i].format(DF));

        }


    }
}


