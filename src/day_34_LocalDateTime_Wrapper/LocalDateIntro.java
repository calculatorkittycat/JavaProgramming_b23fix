package day_34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate eid = LocalDate.of(2021,7,20);

        System.out.println(eid);

        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println("_________________________________________");

        String[] names ={"Jim","Jack","Jerry","Jackie"};

        LocalDate[] DoB = {LocalDate.of(1990,5,25),
                           LocalDate.of(1991,7,2),
                           LocalDate.of(1964,2,19),
                           LocalDate.of(1889,1,1)};

        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]+"'s birthday iz " + DoB[i]);

        }
        System.out.println("_________________________________________");

        LocalDate person1 = LocalDate.of(1980,12,11);
        LocalDate person2 = LocalDate.of(1980,12,25);

        if (person1.isBefore(person2) ){
            System.out.println("Person 1 is older");
        }else{
            System.out.println("Person 2 is the elder");
        }


        if( person1.isAfter(person2)){
            System.out.println("Person 1 is younger");
        }else {
            System.out.println("Person 2 is younger");
        }

        System.out.println("_________________________________________");

        boolean r1 = person1.isLeapYear();
        System.out.println("Is leap year :" + r1);

        boolean r2 = LocalDate.of(2065,4,4).isLeapYear();
        System.out.println("Is leap year :" + r2);

        System.out.println("_________________________________________");

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);

        LocalDate future = currentDate.plusDays(12);

        System.out.println("12 days in future is : " + future);

        LocalDate future2 = currentDate.plusMonths(1);

        System.out.println("1 month from now is : " + future2);

        LocalDate future3 = currentDate.plusYears(6);

        System.out.println("6 years from now is : " + future3  );

        LocalDate future4 = currentDate.plusWeeks(7);

        System.out.println("7 weeks from now is : " + future4);



    }


}
