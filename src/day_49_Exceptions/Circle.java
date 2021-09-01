package day_49_Exceptions;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0 ){
            throw new RuntimeException("Cannot set radius below 0");
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
