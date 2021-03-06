package day_43_OOP_Encapsulation;

public class Circle {

    private double radius, diameter;

    private static double PI = 3.14;


    public double getRadius() {
        return radius;
    }


    public double getDiameter(){
        return diameter;
    }

    public void setRadius(double radius){
        if(radius < 0){
            System.out.println("Radius can not be negative");
            return;
        }
        this.radius = radius;
        setDiameter(radius * 2);
    }

    public void setDiameter(double diameter){
        if(diameter < 0){
            System.out.println("Diameter can not be negative");
            return;
        }
        this.diameter = diameter;
        setRadius(diameter/2);
    }

    public Circle(double radius) {

        setRadius(radius);
    }

    public double area(){
        return radius * radius * PI;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public boolean equals(Circle circle){
        return radius == circle.radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
