package Case1.UnitTests;

import Case1.Pages.MainPage;
import Case1.Base.BaseElement;
import Case1.Utils.DriverFactory;
import Case1.Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public static WebDriver driver;
    BaseElement steps;
    MainPage mainPage;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver(PropertyReader.getBrowser());
        driver.get(PropertyReader.getUrl());
        mainPage = new MainPage();
    }

    @AfterClass
    public void Down() {
        driver.quit();
    }

    @AfterMethod
    public void goBack() {
        driver.navigate().back();
    }
}
