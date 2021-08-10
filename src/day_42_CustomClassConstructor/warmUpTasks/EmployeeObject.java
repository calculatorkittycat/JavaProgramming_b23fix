package day_42_CustomClassConstructor.warmUpTasks;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Johan");
        Employee employee2 = new Employee("Jiggy","Teacher");
        Employee employee3 = new Employee("Jefferson","President",123);
        Employee employee4 = new Employee("Washington","President",123,800.00);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);





    }
}
