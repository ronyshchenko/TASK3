package Cases.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductCardsPage extends BasePage{

    public ProductCardsPage() {
        super();
    }

    By productsImage = By.xpath("//*[@class=\"inventory_item_img\"]");
    By productsName = By.xpath("//*[@class=\"inventory_item_name\"]");
    By productsDesc = By.xpath("//*[@class=\"inventory_item_desc\"]");
    By productsPrice = By.xpath("//*[@class=\"inventory_item_price\"]");
    By select = By.xpath("//select[@class='product_sort_container']");
    By firstOption = By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select/option[1]");
    By secondOption = By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select/option[2]");
    By thirdOption = By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select/option[3]");
    By fourthOption = By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select/option[4]");

    By itemsName = By.xpath("//*/div[@class=\"inventory_item_name\"]");


    WebElement selectMenu;
    WebElement firstOptionMenu;
    WebElement secondOptionMenu;
    WebElement thirdOptionMenu;
    WebElement fourthOptionMenu;



    public Boolean checkProductsCardElements() {
        if (isElementPresent(productsImage) && isElementPresent(productsName) &&
                isElementPresent(productsDesc) && isElementPresent(productsPrice)) {

            return true;
        }
        return false;
    }

    public List<String> checkSelect1() throws InterruptedException {

        List<WebElement> linkList = driver.findElements(itemsName);

        List<String> actualValues = null;

        for(WebElement element: linkList){
            System.out.println(element.getText());
           //actualValues.add(element.getText().toString());
        }
        return actualValues;
    }

    public Boolean checkSelect() throws InterruptedException {
        selectMenu = driver.findElement(select);
        selectMenu.click();
        Thread.sleep(3000);


        if (isElementPresent(firstOption) && isElementPresent(secondOption) &&
                isElementPresent(thirdOption) && isElementPresent(fourthOption)) {

            return true;
        }
        return false;
//
//
//        secondOptionMenu = driver.findElement(secondOption);
//        secondOptionMenu.click();
//
//        thirdOptionMenu = driver.findElement(thirdOption);
//        thirdOptionMenu.click();
//
//
//        fourthOptionMenu = driver.findElement(fourthOption);
//        fourthOptionMenu.click();
//        Thread.sleep(3000);
//
//
//        firstOptionMenu = driver.findElement(firstOption);
//        firstOptionMenu.click();
//
//        return true;
    }



    }

