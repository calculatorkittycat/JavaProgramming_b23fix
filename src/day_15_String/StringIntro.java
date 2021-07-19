package day_15_String;



public class StringIntro {
    public static void main(String[] args) {

        String str = "Cybertek"; //literal
        String str2 = new String("Cybertek"); //new keyword

        System.out.println("__________________________________________");

        String s1 = "Cat";//
        String s2 = "CAt";//this one is stored as a separate object in the string pool because it is spelled differently
        String s3 = "Cat";//creates one object in the string pool

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println("__________________________________________");

        String s4 = new String("Cat");
        String s5 = new String("Dog");//stored in two different memory locations in the java memory heap
        String s6 = new String("Dog");

        System.out.println(s4==s5);
    }
}
