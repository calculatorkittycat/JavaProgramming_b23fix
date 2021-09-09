package day_53_Abstraction;

import day_51_Abstraction.shapeTask.Circle;
import day_51_Abstraction.shapeTask.Rectangle;
import day_51_Abstraction.shapeTask.Shape;
import day_51_Abstraction.shapeTask.Square;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        Shape circle = new Circle(5);
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(4,5);

        /*
        WebDriver driver = new ChromeDriver();
                        = new FirefoxDriver();
                        = new OperaDriver();
                        ...

               driver.get()
         */


        System.out.println("____________________");


         Shape[] array = {
                new Circle(5),
                new Square(10),
                new Rectangle(4,5),
                new Circle(5),
                new Square(10),
                new Rectangle(4,5),
        };

//Array collection and map are the 3 data structures in java Arraylist Collections and map


        ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(array));
        shapes.addAll(Arrays.asList(
                new Circle(10), new Square(15),new Square(15),new Square(15),
                new Square(15),new Square(15),new Square(15),
                new Rectangle(100, 200),new Rectangle(100, 200),new Rectangle(100, 200),
                new Square(15),new Square(15),new Square(15),new Square(15)
        ));

        int numberOfSquares = 0,
                numberOfRectangles = 0,
                numberOfCircles = 0;

        for (Shape each : shapes) {
            if(each instanceof Rectangle){
                numberOfRectangles++;
            }else if( each instanceof Square){
                numberOfSquares++;
            }else{
                numberOfCircles++;
            }
        }

        System.out.println("numberOfSquares = " + numberOfSquares);
        System.out.println("numberOfRectangles = " + numberOfRectangles);
        System.out.println("numberOfCircles = " + numberOfCircles);

        System.out.println("______________________");





    }


}
