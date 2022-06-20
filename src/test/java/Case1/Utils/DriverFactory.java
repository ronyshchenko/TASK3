package Case1.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Case1.Constants;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver = null;

    public static WebDriver getDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().setSize(new Dimension(Constants.widthBrowser,Constants.heightBrowser));
        }
                break;
            case IE:
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver_win32\\chromedriver\\chromedriver.exe");
                driver=new ChromeDriver();
                driver.manage().window().maximize();
        }
        return driver;
    }
}
