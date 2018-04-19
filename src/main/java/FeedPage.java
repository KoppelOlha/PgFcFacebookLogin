import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedPage extends BrowserManager {

    @FindBy(css = "[data-testid~=left_nav_section_Интересное]")
    WebElement tableInteresting;

    public FeedPage feedPageInit() {
        return PageFactory.initElements(BrowserManager.browser, FeedPage.class);
    }

    public boolean isTableInterestingPresent() {
        boolean isTableInterestingDisplayed = tableInteresting.isDisplayed();
        return isTableInterestingDisplayed;

    }

}