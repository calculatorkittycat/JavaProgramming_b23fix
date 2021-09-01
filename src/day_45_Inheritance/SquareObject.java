package day_45_Inheritance;

public class SquareObject {

    public static void main(String[] args) {

        Square square = new Square(5.5);
        Square square1 = new Square(6.5);

        System.out.println(square.getSide());
        System.out.println(square.area());
        System.out.println(square.equals(square1));
        System.out.println("______________________________");

        Square s1 = new Square(5);
        Square s2 = s1;

        s2.setSide(10);
        System.out.println(s1.getSide() + " : " + s2.getSide());

        System.out.println("______________________________");

        Square l1 = new Square(3);
         l1 = new Square(4);

        System.out.println(l1.getSide());

    }
}
