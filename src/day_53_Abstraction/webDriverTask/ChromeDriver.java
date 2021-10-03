package day_53_Abstraction.webDriverTask;

public class ChromeDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("Chrome driver navigating to : " + url);
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

//When abstract methods are implemented into a class they must have body.
//That is why you must inherit the methods with bodies from the abstract class