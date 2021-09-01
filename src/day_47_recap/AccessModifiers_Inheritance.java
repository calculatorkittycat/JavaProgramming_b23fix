package day_47_recap;

import utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {

    public void method() {
        System.out.println(publicVariable);
        //always visible
        System.out.println(protectedVariable);
        //protected can be visible outside the package if there is a sub class
        //sub class is created when there is inheritance
        //System.out.println(defaultVariable);
        //not visible outside of the package
        //System.out.println(privateVariable);
        //private is not visible outside the class

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //not visible outside of the package
        //privateMethod();
        //private method not visible outside of class
    }

}
