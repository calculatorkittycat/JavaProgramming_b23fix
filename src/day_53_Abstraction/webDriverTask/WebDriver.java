package day_53_Abstraction.webDriverTask;
//Interface is not a class
//public is the only access modifier that can be used in interface because it is meant to be inherited
public interface WebDriver {

    //void method2(){
      //this is an instance method and will give a compiler error because interface can not have instance methods
    //}

    //public WebDriver(){
        //this is a constructor and will give a compiler error because interface can not have instance methods
    //}
    //constructors are used for creating objects, you can not create an object from an interface
    //you can only create an object from a class


    //public abstract void get(String url); // same thing as line 18 because public and abstract are already given in an interface
                      void get(String url); //this is an abstract method
                      void findElement(String locator);
                      void getTitle();
                      void quit();


   // public static void main(String[] args) {// default methods can exist in interface but no use


   // }

   // default void method(){ //default methods can exist in interface but no use as of yet

   // }


}
