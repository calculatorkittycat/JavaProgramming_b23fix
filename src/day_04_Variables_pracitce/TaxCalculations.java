package day_04_Variables_pracitce;

public class TaxCalculations {

    public static void main(String[] args) {

        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;

        double salaryAfterTax = salary - totalFederalTax - totalStateTax;



        // You need to pay ammount to stateTax

        System.out.println("My salary is : "+salary);
        System.out.println("I will need to pay : "+totalStateTax+" in state tax per year");
        System.out.println("I will need to pay : "+totalFederalTax+" in federal tax per year" );
        System.out.println("My salary after tax is : "+ salaryAfterTax);




    }
}
