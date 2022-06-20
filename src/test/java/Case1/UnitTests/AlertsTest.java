package Case1.UnitTests;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AlertsTest extends BaseTest {

    @Test()
    public void mainPageOpen() throws InterruptedException {
        String existenceTitle = driver.getTitle();
        String expectTitle = "Интернет-магазин ROZETKA™: официальный сайт самого популярного онлайн-гипермаркета в Украине";
        Assert.assertEquals(existenceTitle, expectTitle);
    }

    @Test()
    public void buyGoods() throws InterruptedException {
        String existenceNameGoods = mainPage.buyGoods();
        String expectNameGoods = "Apple MagSafe 2 85 Вт для MacBook Pro с 15\" дисплеем Retina (MD506Z/A)";
        Assert.assertEquals(existenceNameGoods, expectNameGoods);
    }
}