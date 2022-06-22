package Cases.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class LoginPage extends BasePage{

    public LoginPage() {
        super();
    }

    WebElement userInput = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
    WebElement passwordInput = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[2]/input"));
    WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

    WebElement userNameStr = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[1]"));
    WebElement passwordStr = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]"));

    By products = By.xpath("//*[@id=\"header_container\"]/div[2]/span\n");

    public Boolean checkCoordinates() {
        if((userInput.getLocation().getY() < passwordInput.getLocation().getY()) &&
                (passwordInput.getLocation().getY() < loginButton.getLocation().getY())) {
            return true;
        }
        return false;
    }

    public Boolean authorization() throws InterruptedException{
      userInput.sendKeys(userNameStr.getText().split(":", 2)[1].split("locked", 2)[0]);
      passwordInput.sendKeys(passwordStr.getText().split(":", 2)[1]);
      loginButton.click();
      Thread.sleep(3000);

      if (isElementPresent(products)) {
          return true;
      }
          return false;
    }
}

