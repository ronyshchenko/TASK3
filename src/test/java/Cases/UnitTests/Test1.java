package Cases.UnitTests;
import org.testng.Assert;
import org.testng.annotations.Test;

//
//
//Verify right position all elements on login page
//        Steps
//        1. open site
//        Expected results
//        Username field above password field
//        Login btn below password field
//

public class Test1 extends BaseTest {

    @Test()
    public void loginPageOpen() throws InterruptedException {
        String existenceTitle = driver.getTitle();
        String expectTitle = "Swag Labs";
        Assert.assertEquals(existenceTitle, expectTitle);
    }

    @Test()
    public void checkOrder() throws InterruptedException {
        Thread.sleep(5000);
        Boolean existenceOrder = loginPage.checkCoordinates();
        Boolean expectOrder = true;
        Assert.assertEquals(existenceOrder, expectOrder);
    }
}