package day_45_Inheritance;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side < 0){
            return;//return means exit the method
        }
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double parameter(){
        return side * 4;
    }

    public boolean equals(Square square){
        return side == square.getSide();
    }

    public String toString() {
        return "Square{" +
                "side = " + getSide() +
                "area = " + area() +
                "parameter =" + parameter() +
                '}';
    }
}
