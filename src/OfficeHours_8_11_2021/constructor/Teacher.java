package OfficeHours_8_11_2021.constructor;

public class Teacher {

    public String name;
    public int age;

    public Teacher() {
        System.out.println("No arg constructor");
        method1();
    }

    public Teacher(String name) {
        this.name = name;
        System.out.println(name + "No param constructor");
    }

    public Teacher(int age) {
        this.age = age;
        System.out.println(age + "age param constructor");
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age + "age param constructor");
    }

    public void method1(){
        // this(); compiler error
        System.out.println("Method 1 is running");
    }

}
