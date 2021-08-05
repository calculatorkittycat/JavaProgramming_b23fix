package day_39_CustomeClasses_Static.salaryCalculatorTask;

public class EmployeeSalaries {

    public static void main(String[] args) {

        SalaryCalculator employee1 = new SalaryCalculator();
        employee1.setInfo(65,7,23,45);

        System.out.println(employee1);


        SalaryCalculator employee2 = new SalaryCalculator();
        employee2.setInfo(50,5,25,40);

        System.out.println(employee2);


    }
}
