package pages;

import framework.BrowserManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedPage extends BrowserManager {

    @FindBy(className = "imgWrap")
    WebElement userIcon;

    public FeedPage feedPageInit() {
        return PageFactory.initElements(BrowserManager.getBrowser(), FeedPage.class);
    }

    public boolean isUserIconDisplayed() {
        return userIcon.isDisplayed();
    }

}