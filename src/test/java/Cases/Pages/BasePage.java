package Cases.Pages;

import Cases.Utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    static WebDriver driver;

    public BasePage() {
        this.driver = DriverFactory.driver;
    }

    public boolean isElementPresent(By element) {
        try {
            driver.findElement(element);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
