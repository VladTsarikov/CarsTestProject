package framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class BaseEntity {

    private static PropertyReader propertyReader = new PropertyReader();
    private static String url = propertyReader.getProperty("URL");
    protected static int wait = Integer.parseInt(propertyReader.getProperty("Wait"));
    protected int timeOut = Integer.parseInt(propertyReader.getProperty("TimeOut"));
    protected static WebDriver driver;

    @BeforeClass
    public static void before(){

        driver = BrowserFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
        driver.get(url);

    }

    @AfterClass
    public static void after(){
        driver.quit();
    }

}
