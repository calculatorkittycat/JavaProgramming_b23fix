package day_37_ArrayLists;

public class CatPark {
    public static void main(String[] args) {



        Cat cat1 = new Cat();
        cat1.setInfo("Whiskers","Russian Blue",13,"Loner",
                "Outdoor Cat","Dark Grey","Male");

        cat1.getInfo();

        System.out.println("______________");

        Cat cat2 = new Cat();
        cat2.setInfo("Cheeze-its","Breed Unknown",2,"Dumb","Indoor",
                "Calico","Male");

        cat2.getInfo();

        System.out.println("______________");

        cat1.eat("Fish");
        cat1.drink("Milk");
        cat1.play("hide and seek");
        System.out.println("______________");
        cat2.eat("lard");
        cat2.drink("gasoline");
        cat2.play("with a gun");






    }



}
