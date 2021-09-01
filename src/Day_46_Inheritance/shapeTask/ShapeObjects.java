package Day_46_Inheritance.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        //new Circle()

        Circle circle = new Circle(3);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(7,3);
        System.out.println(rectangle);

        Square square = new Square(99);
        System.out.println(square);
    }
}
