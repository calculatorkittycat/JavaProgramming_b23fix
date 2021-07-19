package day_20_loops;

public class CatsAndDogs {

    public static void main(String[] args) {
        String sentence = "Cat Dog Dog Cat";


        int numberOfCats = 0;
        int numberOfDogs = 0;

        for(int i = 0;i <= sentence.length()-3; i++){//-3 is to keep from out of bounds exception
            String each = sentence.substring(i, i+3); //this substring has 3 characters
            if(each.equalsIgnoreCase("cat")){
                numberOfCats++;
            }if(each.equalsIgnoreCase("dog")){
                numberOfDogs++;
            }

        }

        System.out.println("numberOfCats = " + numberOfCats);
        System.out.println("numberOfDogs = " + numberOfDogs);

        boolean equal = numberOfCats == numberOfDogs;

        System.out.println(equal);
    }

}
