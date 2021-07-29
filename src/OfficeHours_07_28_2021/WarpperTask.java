package OfficeHours_07_28_2021;

public class WarpperTask {

    public static void main(String[] args) {


        String str = "Wel252co@5m%@525e t!!!!!o co@23#r23@%e ja@##@%24va@#";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase((str.charAt(i))))
                result+=" ";

            if(Character.isAlphabetic((str.charAt(i))))
                result+=str.charAt(i);
        }
        System.out.println(result.trim());





    }
}
