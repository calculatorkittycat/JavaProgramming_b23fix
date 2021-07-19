package day_30_Review;

public class BranchingSatements {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            if(i == 3){
                return;
            }
            System.out.println(i);
        }
        System.out.println("Hai2u");// will not be printed if you used return function, will be printed if you use break statement
    }
}
