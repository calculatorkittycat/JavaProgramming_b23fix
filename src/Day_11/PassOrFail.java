package Day_11;

public class PassOrFail {

    public static void main(String[] args) {


        char grade = 'Q';


        //a,b,c,d=pass :: f=fail

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("FAILURE");
                break;
            default:
                System.out.println("INVALVID");
        }
    }
}
