package day_53_Abstraction.webDriverTask;

public class OperaDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Opera driver navigating to : " + url);
    }

    @Override
    public void findElement(String locator) {

    }

    @Override
    public void getTitle() {

    }

    @Override
    public void quit() {

    }
}
