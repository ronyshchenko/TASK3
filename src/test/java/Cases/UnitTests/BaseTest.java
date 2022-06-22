package Cases.UnitTests;

import Cases.Pages.LoginPage;
import Cases.Base.BaseElement;
import Cases.Pages.ProductCardsPage;
import Cases.Utils.DriverFactory;
import Cases.Utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public static WebDriver driver;
    BaseElement baseElement;
    LoginPage loginPage;
    ProductCardsPage productCardsPage;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver(PropertyReader.getBrowser());
        driver.get(PropertyReader.getUrl());
        loginPage = new LoginPage();
        productCardsPage = new ProductCardsPage();
    }

//    @AfterClass
//    public void Down() {
//        driver.quit();
//    }
}
