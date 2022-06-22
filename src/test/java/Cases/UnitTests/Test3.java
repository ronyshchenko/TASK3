package Cases.UnitTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends BaseTest {

    @Test()
    public void loginPageOpen() throws InterruptedException {
        String existenceTitle = driver.getTitle();
        String expectTitle = "Swag Labs";
        Assert.assertEquals(existenceTitle, expectTitle);
    }

    @Test()
    public void loginning() throws InterruptedException {
        Thread.sleep(3000);
        Boolean existenceAutorization = loginPage.authorization();
        Boolean expectAutorization = true;
        Assert.assertEquals(existenceAutorization, expectAutorization);
    }

    @Test()
    public void select() throws InterruptedException {
        Thread.sleep(5000);
        Boolean existenceProduct = productCardsPage.checkProductsCardElements();
        Boolean expectProduct = true;
        Assert.assertEquals(existenceProduct, expectProduct);
    }
}