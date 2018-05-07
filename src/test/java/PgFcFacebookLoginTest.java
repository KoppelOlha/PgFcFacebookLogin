import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PgFcFacebookLoginTest {

    @BeforeMethod
    public void browser() {
        BrowserManager browserManager = new BrowserManager();
        browserManager.setBrowser();
    }

    public void loginFacebook(String LOGIN, String PASSWORD) {
        FeedPage feedPage = Navigation.openMainPage().loginFacebook(LOGIN, PASSWORD);
        Assert.assertTrue(feedPage.isUserIconDisplayed());
    }

    @Test
    public void login1Facebook() {
        loginFacebook("", "");
    }

    @Test
    public void login2Facebook() {
        loginFacebook("", "");
    }

    @Test
    public void login3Facebook() {
        loginFacebook("", "");
    }

    @AfterMethod
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}

