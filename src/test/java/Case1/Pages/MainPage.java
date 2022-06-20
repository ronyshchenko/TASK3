package Case1.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    public MainPage() {
        super();
    }

    public String buyGoods() throws InterruptedException{
        WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
        WebElement button = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/rz-header[1]/rz-main-header[1]/header[1]/div[1]/div[1]/div[1]/form[1]/button[1]"));
        search.sendKeys("MD506Z/A");

        button.click();
        Thread.sleep(3000);

        WebElement shoppingCart = driver.findElement(By.cssSelector("button[class='buy-button button button--with-icon button--green button--medium ng-star-inserted']"));
        shoppingCart.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/app-root/single-modal-window/div[3]/div[1]/button")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//img[@alt='Rozetka Logo']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[7]/rz-cart/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/single-modal-window/div[3]/div[2]/rz-shopping-cart/div/ul/li/rz-cart-product/div/div[1]/div/a")).click();


        String good = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-product/div/rz-product-top/div/div[1]/h1")).getText();

        return good;

    }
}
