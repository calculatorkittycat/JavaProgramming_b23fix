package day_04_Variables_pracitce;

public class EmployeeInfo {

    public static void main(String[] args) {

        /*
         1. declare the following variables:
                    first name, last name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee
         */


        String firstName = "Aaron";
        String lastName = "King";
        String fullName = firstName + " " + lastName;
        String gender = "Male";
        int age = 25;
        String companyName = "Microsoft";
        String jobTitle = "SDET";
        boolean fullTime = true;
        boolean isMarrdied = true;
        int salary = 110000;


        System.out.println("FullName: " +fullName);
        System.out.println("________________");

        System.out.println( "Employee full name is: "+ fullName );
        System.out.println("________________");

        System.out.println(fullName+" is "+gender);
        System.out.println("________________");

        System.out.println(fullName+" is "+age+" years old");
        System.out.println("________________");

        System.out.println(fullName+ " works at "+companyName);
        System.out.println("________________");

        System.out.println(fullName+"'s job title is "+jobTitle);
        System.out.println("________________");

        System.out.println(fullName+" is fulltime: "+fullTime);
        System.out.println("________________");

        System.out.println(fullName+" is married: "+isMarrdied);
        System.out.println("________________");

        System.out.println(fullName+"'s salary is "+salary);
        System.out.println("________________");

        System.out.println(fullName+" is "+age+". He is "+gender+" and works at "+companyName+" as an "+jobTitle);
        System.out.println("Is he fulltime? : "+fullTime);
        System.out.println("Is he married?  : "+isMarrdied);
        System.out.println("His salary is   : "+salary);







    }
}
