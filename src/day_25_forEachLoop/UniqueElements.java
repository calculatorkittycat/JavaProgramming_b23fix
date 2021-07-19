package day_25_forEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words ={"Java", "java", "Python", "Ruby", "Basic"};

        for (String each : words) {

            int count = 0;
            for (String word : words) {
                if (word.equals(each)) {
                    count++;
                }
            }


            if (count == 1) {
                System.out.println(each);
            }

        }

    }
}
