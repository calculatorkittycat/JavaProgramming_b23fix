package day_50;

public class Rectangle {

    double height;
    double length;

    public Rectangle(double height, double length) {
        setHeight(height);
        setLength(length);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if( height <= 0){
            throw new RuntimeException("NO! " + length + " is not valid");
        }
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if( height <= 0){
            throw new RuntimeException("NO! " + length + " is not valid");
        }
        this.length = length;
    }
}
