package day_42_CustomClassConstructor;

public class ThisKeyword {

    int a;
    static int b;

    public void method1(){
        System.out.println("Instance Method");
    }

    public static void method2(){
        System.out.println("Static Method");
    }

    public ThisKeyword(){
        System.out.println( this.a );
        this.method1();

        //System.out.println(this.b); static prefers to be called through the object
        //this.method1();
    }


}
