package day_60_Again;

public class MethodRetunsLongestPrac {

    String returnLongest(String str1, String str2){
        if(str1.length()>str2.length()){
            return str1;
        }else {
            return str2;
        }
    }

    public static void main(String[] args) {

        String str1 = "hey i am kind long";
        String str2 = "hey i am kinda longer";

        String str3 = new MethodRetunsLongestPrac().returnLongest(str1,str2);
        System.out.println(str3);

    }
}
