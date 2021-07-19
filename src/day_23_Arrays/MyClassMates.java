package day_23_Arrays;

public class MyClassMates {
    public static void main(String[] args) {

        //if i know what the elements are that I want to be stored use this method
        String[] names = {"JR", "Jay R", "Junior", "Credo"};
        System.out.println("Size: " + names.length);
        //if we dont know what the elements are but i know how many

        for (int i = 0; i <= names.length-1; i++) {// represents the index numbers of the array
            System.out.println(names[i]);

        }

        System.out.println("_________________________________________________");
        String[] names2 = new String[4];
        System.out.println("Size: " +names2.length );
        names2[0] = "Lampsins";
        for (int i = 0; i <= names2.length-1; i++) {
            System.out.println(names2[i]);

        }

    }
}
