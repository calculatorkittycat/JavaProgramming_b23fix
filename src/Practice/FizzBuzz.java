package Practice;

public class FizzBuzz {

    public static void main(String[] args) {

        //String result = "";


        for (int i = 1; i < 100; i++) {
            if ( i % 15 == 0) {
                System.out.print("fizzbuzz ");
            }else if ( i % 3 == 0){
                System.out.print("fizz ");
            }else if ( i % 5 == 0) {
                System.out.print("buzz ");
            }else{
                System.out.print(i + " ");
            }
        }
        //System.out.print(result + " ");



    }
}
