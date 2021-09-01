package day_47_recap.browsersTask;

public class BrowserObjects {

    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.open();
        chrome.close();
        System.out.println("_____________");

        Firefox firefox = new Firefox();
        firefox.open();
        firefox.close();
        firefox.open();
        firefox.navigate("www.yourmom.com");
        firefox.refresh();
        firefox.backward();
        firefox.forward();

        System.out.println("_____________");

        Opera opera = new Opera();
        opera.open();
        opera.close();

        System.out.println("_____________");

        Safari safari = new Safari();
        safari.open();
        safari.close();

        System.out.println("_____________");

        Edge edge = new Edge();
        edge.open();
        edge.close();






    }



}
