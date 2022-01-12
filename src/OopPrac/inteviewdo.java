package OopPrac;

public class inteviewdo {

    public static void main(String[] args) {

        String str = "java  is   cool   ";

        str = str.replaceAll("\\s+"," ");

        System.out.println(str);


        String string = "racecar";
        String reverse = "";
        for (int i = string.length()-1; i >= 0 ; i--) {
            reverse+=string.charAt(i);
        }
        System.out.println(reverse);

        if(string.equalsIgnoreCase(reverse)){
            System.out.println("Palidrome");
        }else{
            System.out.println("Fail");
        }


    }




}
