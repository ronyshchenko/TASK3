package Cases.UnitTests;
import Cases.Pages.ProductCardsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test4 extends BaseTest {

    @Test(priority = 1)
    public void loginPageOpen() throws InterruptedException {
        String existenceTitle = driver.getTitle();
        String expectTitle = "Swag Labs";
        Assert.assertEquals(existenceTitle, expectTitle);
    }

    @Test(priority = 2)
    public void loginning() throws InterruptedException {
        Thread.sleep(3000);
        Boolean existenceAutorization = loginPage.authorization();
        Boolean expectAutorization = true;
        Assert.assertEquals(existenceAutorization, expectAutorization);
    }

    @Test(priority = 3)
    public void checkMenu() throws InterruptedException {
        List<String> actualValues = new ArrayList<String>();
        List<String> expectedValues = null;

        for (String s : actualValues = productCardsPage.checkSelect1()) System.out.println(s);
        Assert.assertEquals(actualValues, expectedValues);

    }
}