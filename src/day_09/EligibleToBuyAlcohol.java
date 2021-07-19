package day_09;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {
        String name = "Johnny";
        int age = 5;

        if (age >= 21){
            System.out.println(name + " is " + age + " and he is eligible");
        }else{
            System.out.println(name + " is " + age + " and he is not eligible");
        }
    }
}
