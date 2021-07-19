package day_08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {


        System.out.println( true  );
        System.out.println( false );
        System.out.println( !true ); //swap value
        System.out.println( !false); // swap value

        System.out.println( true == false ); //will return false, false does not equal true
        System.out.println( true == !false); //will return true, because it is actually true = true, which is... true.

        System.out.println( true != !true); //true is not euqual to the opposite of true (false)

        System.out.println("________________________________");

        int score = 80;

        boolean pass = score >= 60;
        boolean failed = !pass;
        //instead of creating another you can just create the opposite.
        System.out.println(pass);

        System.out.println("________________________________");

        int age = 21;

        boolean eligible = age >= 21;
        boolean notEligible = !eligible;
        System.out.println(eligible);

        System.out.println("________________________________");






    }
}
