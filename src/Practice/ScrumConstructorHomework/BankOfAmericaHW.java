package Practice.ScrumConstructorHomework;

import Day_41_CustomClassConstructor.ScrumTask.Tester;

import java.util.Arrays;

public class BankOfAmericaHW {
    public static void main(String[] args) {

        //Scrum Team 1
        TesterHw tester1 = new TesterHw("Squidward", 'm', "QA", 123, 123000.00);
        TesterHw tester2 = new TesterHw("Mrs.Puff", 'f', "SM", 124, 124000.00);
        TesterHw tester3 = new TesterHw("Mr.Krabbs", 'm', "QA", 125, 125000.00);

        TesterHw[] testers = {tester2,tester3};

        DeveloperHw developer1 = new DeveloperHw("Plankton", 'm', "Software Developer", 126, 126000);
        DeveloperHw developer2 = new DeveloperHw("Gary", 'm', "Java Developer", 127, 127000);
        DeveloperHw developer3 = new DeveloperHw("Barnacle Boy", 'm', "Software Developer", 128, 128000);
        DeveloperHw developer4 = new DeveloperHw("Sandy Cheeks", 'f', "Java Developer", 129, 129000);

        DeveloperHw[] developers = {developer2,developer3,developer4};

        ScrumTeam scrum1 = new ScrumTeam("Patrick Star", "Larry Lobster", "Spongebob");

        //Scrum Team 2

        TesterHw tester4 = new TesterHw("DeeDee", 'f', "QA", 130, 130000.00);
        TesterHw tester5 = new TesterHw("Stu", 'm', "SDET", 131, 131000.00);
        TesterHw tester6 = new TesterHw("Charlotte", 'f', "QA", 132, 132000.00);
        TesterHw tester7 = new TesterHw("Dr.Lipchitz", 'm', "SDET", 133, 133000.00);

        TesterHw[] testers2 = {tester4,tester5,tester6,tester7};

        DeveloperHw developer5 = new DeveloperHw("Lillian", 'f', "Java Developer", 134, 134000);
        DeveloperHw developer6 = new DeveloperHw("Kimi", 'm', "Software Developer", 135, 135000);
        DeveloperHw developer7 = new DeveloperHw("Grandpa", 'm', "Java Developer", 136, 136000);
        DeveloperHw developer8 = new DeveloperHw("Betty", 'f', "Software Developer", 137, 137000);
        DeveloperHw developer9 = new DeveloperHw("LuLu", 'f', "Java Developer", 138, 138000);

        DeveloperHw[] developers2 = {developer5,developer6,developer7,developer8,developer9};

        ScrumTeam scrum2 = new ScrumTeam("Tommy Pickles","Angelica Pickles","Suzie Carmichael");

        //Scrum Team 3

        TesterHw tester8 = new TesterHw("Betty", 'f', "QA", 130, 130000.00);
        TesterHw tester9 = new TesterHw("Fred", 'm', "SDET", 131, 131000.00);
        TesterHw tester10 = new TesterHw("Wilma", 'f', "QA", 132, 132000.00);
        TesterHw tester11 = new TesterHw("Mr.Slate", 'm', "SDET", 133, 133000.00);

        TesterHw[] testers3 = {tester8,tester9,tester10,tester11};

        DeveloperHw developer10 = new DeveloperHw("Tree Flower", 'f', "Java Developer", 134, 134000);
        DeveloperHw developer11 = new DeveloperHw("Trucklee", 'm', "Software Developer", 135, 135000);
        DeveloperHw developer12 = new DeveloperHw("Big Rabbit", 'm', "Java Developer", 136, 136000);
        DeveloperHw developer13 = new DeveloperHw("Chelsea", 'f', "Software Developer", 137, 137000);
        DeveloperHw developer14 = new DeveloperHw("Stacy", 'f', "Java Developer", 138, 138000);

        DeveloperHw[] developers3 = {developer10,developer11,developer12,developer13,developer14};

        ScrumTeam scrum3 = new ScrumTeam("Dagit","Norbert","Barry");


        ScrumTeam[] scrumTeams = {scrum1,scrum2,scrum3};


        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);

        System.out.println(scrum1);


        double budget = 0;

        for (TesterHw eachTester : scrum1.testers ){
            budget += eachTester.salary;
        }

        for (DeveloperHw eachDeveloper : scrum1.developers) {
            budget += eachDeveloper.salary;
        }
        System.out.println("______budget______");
        System.out.println(budget);

        System.out.println("____testers____");

        scrum2.hireTester(testers2);
        scrum2.hireDeveloper(developers2);

        scrum3.hireTester(testers3);
        scrum3.hireDeveloper(developers3);

        double maxTester = 0;
        double maxDeveloper = 0;
        String maxTesterName = "";
        String maxDeveloperName = "";

        for (ScrumTeam eachScrum : scrumTeams){
            for (TesterHw eachTester1 : eachScrum.testers) {
                if (eachTester1.salary > maxTester) {
                    maxTester = eachTester1.salary;
                    maxTesterName = eachTester1.name;
                }
                budget += eachTester1.salary;
            }
            for (DeveloperHw eachDeveloper1 : eachScrum.developers){
                if (eachDeveloper1.salary > maxDeveloper){
                    maxDeveloper = eachDeveloper1.salary;
                    maxDeveloperName = eachDeveloper1.name;
                }
                budget += eachDeveloper1.salary;

            }
        }
        double minDevelop = developer1.salary;
        double minTester = tester1.salary;
        String minTesterName = "";
        String minDeveloperName = "";

        for (ScrumTeam eachScrum : scrumTeams){
            for (TesterHw eachTester2 : eachScrum.testers){
                if (eachTester2.salary < minTester){
                    minTester = eachTester2.salary;
                    minTesterName = eachTester2.name;
                }
            }
            for (DeveloperHw eachDeveloper2 : eachScrum.developers){
                if (eachDeveloper2.salary < minDevelop) {
                    minDevelop = eachDeveloper2.salary;
                    minDeveloperName = eachDeveloper2.name;
                }
            }
            System.out.println(eachScrum);
        }

        int numberOfDevelopers=0;
        int numberOfTesters = 0;
        for (ScrumTeam eachScrumTeam : scrumTeams){
            numberOfDevelopers+=eachScrumTeam.developers.size();
            numberOfTesters+=eachScrumTeam.testers.size();

        }

        System.out.println("Company has " + numberOfDevelopers + "developers");
        System.out.println("Total budget is $" + budget);

        System.out.println(maxDeveloperName + " has max salary of developer " + maxDeveloper);
        System.out.println(maxTesterName + " has max salary of tester " + maxTester);

        System.out.println(minDeveloperName + " has min salary of developer " + minDevelop);
        System.out.println(minTesterName + " has min salary of tester " + minTester);


    }
}