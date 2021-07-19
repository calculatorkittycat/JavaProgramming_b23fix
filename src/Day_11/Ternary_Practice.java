package Day_11;

public class Ternary_Practice {

    public static void main(String[] args) {


        /*
        1. Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
         */


        double salary = 90_000;
        int creditScore = 720;
        String result = (salary >= 60000 && creditScore >= 650) ? "Loan Approved" : "Not Approved";
/*
        if ( salary >= 60000 && creditScore >= 650) { //If person is eligible
                result = "Loan Approved";;
        }else {//if else block is executed you can automatically assume they are not eligible
                result = "Loan Denied";
        }
*/


        System.out.println(result);

        System.out.println("_____________________________________________________");

        /*2. Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY
*/

        String sport = "Soccer";
        int price = (sport == "Soccer" || sport == "Tennis") ? 100 : 50;
        System.out.println("price = " + price);


        System.out.println("_____________________________________________________");

/*3. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with different values: n1 , n2 and n3
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         NOTE: MUST APPLY TERNARY

 */

        int n1 = 100, n2 = 200, n3 = 300;

        String result2 = (n1 > n2 && n1 > n3) ? "n1 is bigger" : (n2 > n1 && n2 > n3) ? "n1 is bigger" : "n3 is bigger";
        System.out.println("result2 = " + result2);


        System.out.println("_____________________________________________________");

        int number = 12;
        String name = "";

        if (number >= 1 && number <= 12) {

            name = (number == 1)? "January" : (number == 2)? "Feburary" :(number == 3)? "March" :(number == 4)? "April"
                    :(number == 5)? "May" :(number == 6)? "June" :(number == 7)? "July" :(number == 8)? "August"
                    :(number == 9)? "September" :(number == 10)? "October" :(number == 11)? "November" : "December" ;



        }else{
            name = "Invalid";
        }
        System.out.println("name = " + name);






    }
}
