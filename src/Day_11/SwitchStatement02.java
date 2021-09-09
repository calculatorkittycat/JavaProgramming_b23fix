package Day_11;

public class SwitchStatement02 {
    public static void main(String[] args) {


        String name = "chrome";

        switch (name){

            case "chrome":
                System.out.println("Chrome Broswer is Selected");
                break; //case closed

            case "firefox":
                System.out.println("Firefox Browser is selected");
                break;

            case "edge":
                System.out.println("Edge browser is selected");

            default:
                System.err.println("Invalid browser name");
        }

        String one = "java";

        switch (one) {

            //case
        }

    }
}
