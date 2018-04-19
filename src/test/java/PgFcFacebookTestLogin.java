import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PgFcFacebookTestLogin {

    @BeforeClass
    public void browser() {
        BrowserManager browserManager = new BrowserManager();
        browserManager.openBrowser();
    }

    @Test
    public void loginFacebook() {
        FeedPage feedPage = Navigation.openMainPage().loginFacebook();
        Assert.assertTrue(feedPage.isTableInterestingPresent());
    }

    @AfterTest
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}

