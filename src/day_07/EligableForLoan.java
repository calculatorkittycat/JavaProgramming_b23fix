package day_07;

public class EligableForLoan {

    public static void main(String[] args) {

        //3. EligileForLoan
        //            income has to be at least 60k
        //            at least have 2 years of work history
        //            at least have 700 of credit score
        //            at least 18 years old
        //
        //        variables:    name, age, workHistory, creditScore, income

        String name = "Randoo";
        int age = 49;
        int workHistory =7;
        int creditScore = 760;
        double income = 45000;
        
        boolean isElegible = age >= 18 && workHistory >=2 && creditScore >= 760 && income >= 60000;

        /*...*/
        /*
        boolean r1 = income >= 60000 && workHistory >=2;
        boolean r2 = age >= 18 && creditScore >= 700;
        boolean isEligible = r1 && r2;
        /*


        //in order to eligible for loan must be 18 years old AND work history must be 2 years AND...
        //Here the income is to low to eligible for the loan

         */
        System.out.println(name + " is eligible for load " +isElegible);


        System.out.println("___________________________");
        int age1 = 99;
        int workHistory1 =15;
        int creditScore1 = 690;
        double income1 = 60000;

        boolean isElegable1 = age >= 18 && workHistory1 >= 5 && creditScore1 >= 700 && income1 >= 60000;

        System.out.println("Is he eligable? : " + isElegable1);

        
        
        
        
    }
}
