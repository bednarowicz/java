package drivers;

public class WebDriverTest {
    public static void main(String[] args) {
        WebDriver driver = getDriver("chrome");
       driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

        /*FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();*/
    }

    private static WebDriver getDriver(String name) {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return  new FirefoxDriver();
        }
        return null;
    }
}
