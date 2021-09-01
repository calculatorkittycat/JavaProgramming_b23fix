package day_28_methods;

public class Custom_Methods {

    public static void main(String[] args) {

        printHello5Times();

    }
    public static void printHello5Times(){
        int n = -5;

        for (int i = 0; i < 5; i++) {
            n*= i;
        }
        System.out.println(n);
    }

}
