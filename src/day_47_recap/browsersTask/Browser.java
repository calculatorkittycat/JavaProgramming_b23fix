package day_47_recap.browsersTask;

public class Browser {

    public void open(){
        System.out.println("Opening Crumb");
    }

    public void close(){
        System.out.println("Closing Crumb");
    }

    public final void navigate(String url){
        System.out.println("Type: " + url);
        System.out.println("Press enter");
    }

    public final void refresh(){
        System.out.println("Press F5");
    }

    public final void backward(){
        System.out.println("Alt + back arrow");
    }

    public final void forward(){
        System.out.println("Alt + forward arrow");
    }

}
