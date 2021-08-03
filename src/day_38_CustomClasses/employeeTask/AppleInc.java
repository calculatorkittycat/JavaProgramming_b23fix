package day_38_CustomClasses.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Poindexter",'M',123,"Net Admin",120000.00);
        System.out.println("emp1");
        System.out.println(employee1);

        employee1.salary = 200250;
        System.out.println("raise for emp1");
        System.out.println(employee1);
        System.out.println("emp2");
        Employee employee2 = new Employee();
        employee2.setInfo("JFK",'M',124,"Presidaint",500500);

        System.out.println(employee2);

        System.out.println("____________________");

        Employee employee3 = new Employee();
       employee3.setInfo("jon",'m',1234,"worker",199999);
        Employee employee4 = new Employee();
        employee4.setInfo("jony",'m',12346,"worker",399888);
        Employee employee5 = new Employee();
        employee5.setInfo("jonee",'m',12345,"worker",799777);

        Employee[] arr = {employee1,employee2,employee3,employee4,employee5};
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll( Arrays.asList(arr) );

        double budget = 0;

        for(Employee each : employees ){
            //System.out.println( each.name + " : " + each.salary);
            //System.out.println(each);
            budget += each.salary;
        }
        System.out.println(budget);

        System.out.println("__________________");

        ArrayList<Employee> list1 = new ArrayList<>();
        list1.removeIf( employee -> employee.salary >= 200000 );

        for (Employee each : list1) {
            System.out.println(each);
        }





    }
}
