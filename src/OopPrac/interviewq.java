package OopPrac;

public class interviewq {

    public static void main(String[] args) {


        String str = "Java    is   cool   ";

        str = str.replaceAll("\\s+"," ");


        System.out.println(str);

/*
     Size: OOP programs are much larger than other programs. ...
    Effort: OOP programs require a lot of work to create. ...
    Speed: OOP programs are slower than other programs, partially because of their size.
 */


        String palin = "racecar";
        System.out.println(palin);
        String reverse = "";

        for (int i = palin.length()-1; i >= 0 ; i--) {
            reverse+= palin.charAt(i);
        }

        System.out.println(reverse);

        boolean r1 = false;
        if(palin.equalsIgnoreCase(reverse)){
            r1 =true;
            System.out.println("ITS A PALINDROME");
        }else{
            r1=false;
            System.out.println("FAIL");
        }

        System.out.println(r1);
    }
}
