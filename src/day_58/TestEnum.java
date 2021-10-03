package day_58;

import java.util.Map;

public class TestEnum {

    public static void main(String[] args) {

        Browser browser = Browser.edge;

        switch (browser){

            case edge:
                System.out.println("edge");
                break;
            case opera:
                System.out.println("opera");
                break;
            case chrome:
                System.out.println("chrome");
                break;
            case safari:
                System.out.println("safari");
                break;
            case firefox:
                System.out.println("firefox");
                break;
            default:
        }

        System.out.println("__________");

        Level level = Level.chucknorris;

        //Months months = Months.december;

        String s1 = String.valueOf(level);

        System.out.println(s1);





    }

}
