package day_34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {

        isBirthday(1980,5,12);

    }

    public static void isBirthday (int year, int month, int day){

        LocalDate DoB = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        int age = today.getYear() - DoB.getYear();
        if(DoB.getMonthValue() == today.getMonthValue() && DoB.getDayOfMonth() == today.getDayOfMonth() ){
            System.out.println("Happy BERFDEIGH");
            System.out.println();
            System.out.println("Your are " + age);

        }else{
            System.out.println("Not today Junior!");
        }
    }
}
