package Day_41_CustomClassConstructor.ScrumTask;

public class BankOfAmerica {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Ivan",'m',"SDET", 123,123000.00);
        Tester tester2 = new Tester("Navi",'m',"SDET", 124,145000.00);
        Tester tester3 = new Tester("Vina",'f',"SDET", 125,265000.00);

        Tester[] testers = {tester2, tester3};

        Developer developer1 = new Developer("X-dev",'m',"DEV",126,421125.00);
        Developer developer2 = new Developer("Y-dev",'f',"DEV",127,325124.00);
        Developer developer3 = new Developer("Z-dev",'f',"DEV",128,224127.00);
        Developer developer4 = new Developer("A-dev",'m',"DEV",129,126123.00);

        Developer[] developers = {developer2,developer3,developer4};

        ScrumTeam scrum1 = new ScrumTeam("Squidward","Patrick Star", "Plankton");
        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTester(testers);//array
        scrum1.hireDeveloper(developers);//array

        scrum1.hireTester(new Tester("Testguy",'m',"SDET",130,132000.00));

        
        System.out.println(scrum1);

        double budget = 0;

        for (Tester eachTester  : scrum1.testers ){
            System.out.println(eachTester);
            budget +=  eachTester.salary;
        }
        System.out.println("________________");
        for (Developer eachDeveloper : scrum1.developers) {
            System.out.println(eachDeveloper);
            budget += eachDeveloper.salary ;
        }

        System.out.println("budget = " + budget);


    }
}
