package Day_46_Inheritance.shapeTask;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side < 0 ){
            return;
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                " side = " + side +
                " area = " + area() +
                " perimeter = " + perimeter() +
                '}';
    }
}
