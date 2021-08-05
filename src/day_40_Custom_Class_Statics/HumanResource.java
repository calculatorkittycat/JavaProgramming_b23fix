package day_40_Custom_Class_Statics;

import day_38_CustomClasses.employeeTask.Employee;

public class HumanResource {

    public static Employee employee1 = new Employee();//ahmet
    public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();
    public static Employee employee4 = new Employee();
    public static Employee employee5 = new Employee();


    static {
        employee1.setInfo("Ahmet",'M',999,"SDET",100000.00);
        employee2.setInfo("Yolandi",'F',998,"SDET",200000.00);
        employee3.setInfo("bebe",'F',997,"SDET",300000.00);
        employee4.setInfo("lolian",'M',996,"SDET",400000.00);
        employee5.setInfo("memo",'M',995,"SDET",500000.00);
    }

    /*
    public static void main(String[] args) {
        employee1.setInfo("Ahmet",'M',999,"SDET",100000.00);
    }
     */
}
