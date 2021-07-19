package day_07;

public class ShortHandOperators {

    public static void main(String[] args) {

        String name1 = "Muktar";
        String name2 = "Mehmet";
        String name3 = name2;

        name2 = name1; //name2 = "Muktar"
        //  name1 = name2; //name1 = "Muktar"
        name1 = name3; // name1 = "mehmet"

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("________________");
        int a = 200;
        System.out.println("a = " + a);

        a = 100 + 300;
        int b = a;
        System.out.println("a = " + a);

        System.out.println("________________");

        int balance = 300;
        balance+=200;


        System.out.println(balance);

        balance+=1000;

        System.out.println(balance);

        System.out.println("________________");

        String school = "Cybertek";
        school += " School";
        System.out.println("school = " + school );

        System.out.println("________________");

        String name = "John";
        String lastName = "Daniel";
        name += " " + lastName;

        System.out.println("name = " + name);

        System.out.println("________________");
        //withdraw
        balance -= 300;

        System.out.println("balance = " + balance);

        balance -= 1000;

        System.out.println("balance = " + balance);

        System.out.println("________________");
        // *=

        double salary = 100000;

        salary *=2;

        System.out.println("salary = " + salary);

        salary *= 1.5;

        System.out.println(salary);

        //0.65

        salary *=0.65;

        System.out.println("after tax = " + salary);

        System.out.println("________________");
        // /=

        int slices = 10;
        slices /=5;
        System.out.println("slices = " + slices);

        double slices2 = 10;
        slices2 /= 3;
        System.out.println("slices2 = " + slices2);

        System.out.println("________________");
        // %=

        int cents = 105;
        int quarters = cents/25;

        cents %= 25;


        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);


        System.out.println("________________");


        /*
        remainder = numerator - (denominator * whole number of division result)

        10/3 ===> 3.333
        remainder = 10 - (3 * 3) = 1
         */



    }
}
