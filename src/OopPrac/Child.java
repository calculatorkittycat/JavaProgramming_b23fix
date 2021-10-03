package OopPrac;

public class Child extends Parent {

    public static void main(String[] args) {

        Parent p1 = new Parent();
        p1.setS1("lol");

        System.out.println(p1.getS1());
        // instance variable s1 has been called though object p1
    }
}
