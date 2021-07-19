package day_06;

public class PostPrePractice {

    public static void main(String[] args) {
        
        
        int a =1;
        a=  -a--  +  a++  /  -a-- * --a;
        //     -1   +  0    /  -1   *  -1    
        //a= 1-1=0+1=1-1=0-1= -1

        System.out.println("a = " + a);

        System.out.println("__________________");
        
        int x = 10;
        x = ++x - x-- + x++ + --x;
        //  11  - 11  + 10  + 10
        System.out.println("x = " + x);


        int y = 50;
        int z = -y++ + --y - ++y +y--;
        //  z = -50  + 50 - 51 + 51
        // -50 + 50 = 0
        // -51 + 51 = 0
        //z = 0

        System.out.println("__________________");

        int p = 100;
        System.out.println(++p);

        int r = 100;
        System.out.println(r++);

        System.out.println("p = " + p);
        System.out.println("r = " + r);
        
    }
}
