package day_25_forEachLoop;

public class UnqiueElements2 {
    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'a', 'c', 'a', 'd', 'd'};

        for (char each : chars) {
            int count = 0;
            for (char characters : chars) {
                if (characters == each) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);

            }


        }
    }
}
