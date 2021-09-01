package day_45_Inheritance.employeeTask;

public class Amazon {

    public static void main(String[] args) {

        Tester tester = new Tester("jam",'m',54,98765435,"Sdet",321604.00);
        tester.eat("bugs");
        Developer developer = new Developer("lak",'m',54,897,"dev",987856.00);
        developer.sleep();
        Driver driver = new Driver("yij",'m',87,9875,"wheelman",98.0);
        driver.drive();




    }


}
