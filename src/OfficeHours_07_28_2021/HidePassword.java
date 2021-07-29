package OfficeHours_07_28_2021;

import java.util.ArrayList;

public class HidePassword {


    public static void main(String[] args) {

        String[] password ={"one", "hi", "hold"};

        ArrayList<String> hiddenPassword = new ArrayList<>();

        for (String each : password) {
            String star = "";
            for (int i = 0; i < each.length(); i++) {
                star+="*";
            }
            hiddenPassword.add(star);
        }

        System.out.println(hiddenPassword);

    }
    public static String convertToStar(String str){
        String star = "";
        for (int i = 0; i < str.length(); i++) {
            star+="*";
    }

        return star;
    }
}
