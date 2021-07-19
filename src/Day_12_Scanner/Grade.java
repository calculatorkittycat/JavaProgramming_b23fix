package Day_12_Scanner;

public class Grade {

    public static void main(String[] args) {


        char grade = 'A';
        String result = "";

        switch (grade){

            case 'A': result = "Excellent";
                break;
            case 'B': result = "Great Job";
                break;
            case 'C': result = "Good";
                break;
            case 'D': result = "passed";
                break;
            case 'F': result = "failed";
                break;
            default: result = "invalid";


        }
        System.out.println("result = " + result);

    }
}
