import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BrowserManager {

    @FindBy(css = "[type~=email]")
    WebElement loginInput;

    @FindBy(css = "#pass")
    WebElement passwordInput;

    @FindBy(xpath = ".//label[@id='loginbutton']")
    WebElement loginButtonClick;

    public FeedPage loginFacebook(String LOGIN, String PASSWORD) {
        loginInput.sendKeys(LOGIN);
        passwordInput.sendKeys(PASSWORD);
        loginButtonClick.click();
        return PageFactory.initElements(BrowserManager.getBrowser(), FeedPage.class);
    }
}