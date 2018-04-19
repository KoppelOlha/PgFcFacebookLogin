import org.openqa.selenium.support.PageFactory;

public class Navigation {

    public static MainPage openMainPage() {
        BrowserManager.browser.get("https://www.facebook.com");
        return PageFactory.initElements(BrowserManager.browser, MainPage.class);
    }
}
