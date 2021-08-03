package day_38_CustomClasses;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Warmup {

    public String employeeName;
    public String gender;
    public int ssn;
    public String employeeId;
    public String jobTitle;
    public double salary;

    public void attendMeeting(String meeting) {
        System.out.println(employeeName + " is in a " + meeting);
    }
    public void work(String working) {
        System.out.println(employeeName + " is " +working);
    }

    public void setInfo ( String eName, String eGender, int eSSN, String eEmpId,
                          String eTitle, double eSalary){
         employeeName = eName;
         gender = eGender;
         ssn = eSSN;
         employeeName = eEmpId;
         jobTitle = eTitle;
         salary = eSalary;

    }

    public void getInfo(){
        System.out.println("employeeName = " + employeeName);
        System.out.println("gender = " + gender);
        System.out.println("ssn = " + ssn);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
    }

}
