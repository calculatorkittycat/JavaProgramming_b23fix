package day03_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {


        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberWeeks;

        System.out.println(salary);


        double taxRate = 0.24;
        double totalTax = taxRate * salary;
        double afterTax = salary - totalTax;

        System.out.println(afterTax);



    }


}
