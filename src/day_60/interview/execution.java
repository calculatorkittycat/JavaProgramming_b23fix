package day_60.interview;

public class execution {

    public static void main(String[] args) {

        function func = (a,b) -> {
            if(a > b){
                return a;
            }else{
                return b;
            }
        };

        int result = func.function(500,100);
        System.out.println(result);
    }
}
