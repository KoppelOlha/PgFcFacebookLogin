import Framework.BrowserManager;
import Framework.Navigation;
import Pages.FeedPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PgFcFacebookLoginTest {

    @BeforeMethod
    public void browser() {
        BrowserManager.setBrowser();
    }

    public void loginFacebook(String login, String password) {
        FeedPage feedPage = Navigation.openMainPage().loginFacebook(login, password);
        Assert.assertTrue(feedPage.isUserIconDisplayed(), "The icon of the user should be present");
    }

    @Test
    public void loginFacebook1() {
        loginFacebook("", "");
    }

    @Test
    public void loginFacebook2() {
        loginFacebook("", "");
    }

    @Test
    public void loginFacebook3() {
        loginFacebook("", "");
    }

    @AfterMethod
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}

