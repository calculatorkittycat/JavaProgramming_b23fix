package day_49_Exceptions;

public class ThrowKeyword {

    public static void main(String[] args) {

        //throw new RuntimeException("!!!!Exception Message");

       // System.out.println("");
/*
        String browser = "Jo Baba";

        //chrome, firefox, opera, safari

        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Chrome");
        }else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Firefox");
        }else if(browser.equalsIgnoreCase("opera")){
            System.out.println("Opera");
        }else if(browser.equalsIgnoreCase("safari")){
            System.out.println("Safari");
        }else{
            throw new RuntimeException("!!!INVALID BROWSER NAME!!! " + browser);
        }

 */


        throw new BreakTimeException();



    }
}
