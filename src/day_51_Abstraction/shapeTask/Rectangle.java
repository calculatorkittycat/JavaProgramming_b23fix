package day_51_Abstraction.shapeTask;

public final class Rectangle extends Shape {

    private double length;
    private double width;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if( length <= 0){
            throw new RuntimeException("aw hell naw!" + length );
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(length <= 0){
            throw new RuntimeException("aw hell naw!" + length);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length+width)*2;
    }
}
