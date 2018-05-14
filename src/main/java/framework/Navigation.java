package framework;

import pages.MainPage;
import org.openqa.selenium.support.PageFactory;

public class Navigation {

    public static MainPage openMainPage() {
        BrowserManager.getBrowser().get("https://www.facebook.com");
        return PageFactory.initElements(BrowserManager.getBrowser(), MainPage.class);
    }
}
