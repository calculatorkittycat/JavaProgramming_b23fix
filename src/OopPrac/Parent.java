package OopPrac;

public class Parent {

    private String s1 = "first var";

    public void setS1 (String s1){
        if(s1.equals("lol")){
            throw new RuntimeException("Can not be lol");
            //System.out.println("Cannot be lol");
            //return;
        }
        this.s1= s1;
    }

    public String getS1(){
        return s1;
    }
}
