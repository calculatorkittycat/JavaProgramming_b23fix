package day_37_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Neptune";
        dog1.breed = "Heeler";
        dog1.age = 3;
        dog1.size = "Medium small";
        dog1.color = "Black";
        dog1.gender = "Female";
        System.out.println("______________");

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.gender);

        Dog dog2 = new Dog();
        dog2.setInfo("Pizza","Mut",6,"Large","Black n Brown","Male");

        Dog dog3 = new Dog();
        dog3.setInfo("Calculus","German Short-hair",7,"Medium","Black Grey", "Male");

        dog1.bark();
        dog2.bark();
        dog3.bark();

        System.out.println("______________");

        dog2.eat("nosh");
        dog3.drink("Water");
        dog1.play();

        System.out.println("______________");

        dog1.getInfo();
        System.out.println("______________");

        dog2.getInfo();
        System.out.println("______________");

        dog3.getInfo();
        System.out.println("______________");

        Dog[] dogs = {dog1,dog2,dog3};
        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.addAll(Arrays.asList(dog1, dog2, dog3));



    }



}











/*
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Neptune";
        dog1.gender = "Female";
        dog1.breed = "Kangal";
        dog1.age = 5;
        dog1.size = "large";
        dog1.color = "black";

        System.out.println(dog1.name);
        System.out.println(dog1.gender);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);

        Dog dog2 = new Dog();
        dog2.setInfo("Bobby",1,"male","black","fucking massive","barker");

        Dog dog3 = new Dog();
        dog3.setInfo("ninja",1,"male","Blue","Medium","Husky");

        dog1.bark();

    }




 */
