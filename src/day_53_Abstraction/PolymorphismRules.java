package day_53_Abstraction;

import day_45_Inheritance.animalTask.Animal;
import day_45_Inheritance.animalTask.Dog;
import day_47_recap.phone.Phone;
import day_47_recap.phone.Samsung;
import day_47_recap.phone.iPhone;

public class PolymorphismRules {

    public static void main(String[] args) {

        Phone phone1 = new iPhone("12","large","black",1000);
        phone1.call(1234);
        phone1.text(1234);
        ((iPhone) phone1).faceTime(1234);

        Phone phone2 = new Samsung("s16","medium", "white",9000);


        //((ChromeDriver)Webdriver) driver = new ChromeDriver

        Animal animal = new Dog("Lucy", "Husky", 'f',"Large",10,"white");
        animal.drink("milk");
        animal.eat("meat");
        animal.eat("sleep");
        ((Dog) animal).bark();
    }


}
