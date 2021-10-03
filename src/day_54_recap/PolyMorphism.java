package day_54_recap;

import day_37_ArrayLists.Dog;
import day_51_Abstraction.shapeTask.Circle;
import day_51_Abstraction.shapeTask.Rectangle;
import day_51_Abstraction.shapeTask.Shape;

public class PolyMorphism {

    public static void main(String[] args) {

        Object obj = (Object) new Dog(); //upcasting
        //obj.play();
        ( (Dog) obj ).play(); //down casting

        System.out.println("______________________________");

        Shape obj2 = new Circle(3);

        System.out.println(obj2.area());
        System.out.println(((Circle) obj2).getR());

        System.out.println(obj2 instanceof Readable);


    }
}
