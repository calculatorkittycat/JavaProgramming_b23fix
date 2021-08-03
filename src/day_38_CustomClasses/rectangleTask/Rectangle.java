package day_38_CustomClasses.rectangleTask;

public class Rectangle {

    public double length, width;

    public void setInfo(double length, double width){
    this.length = length;
    this.width = width;
    }

    public double calculateArea(){
        return  length * width ;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
        }



    public String toString() {
        return "Rectangle Attributes: " +
                "length = " + length +
                ", width = " + width +
                ", area = " +calculateArea() +
                ", perimeter = " +calculatePerimeter()+
                '}';
    }
}

