package day_25_forEachLoop;

public class ReverseElementTwo {

    public static void main(String[] args) {

        String[] array = {"Java","Python", "Ruby on Fucking RAILS BITCH", "School", "Cybertonk"};

        for (String element : array) {

            String reverse = "";
            for (int i = element.length()-1; i >= 0; i--) {//index numbers of the element string
                reverse += element.charAt(i);//gets the characters from the string element starting from last index to index 0
                // this inner loop is responsible for reversing the string
            }
            System.out.println(reverse);
        }

    }
}
