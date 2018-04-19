import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BrowserManager {

    private static final String LOGIN = "";
    private static final String PASSWORD = "";

    @FindBy(css = "[type~=email]")
    WebElement loginInput;

    @FindBy(css = "#pass")
    WebElement passwordInput;

    @FindBy(xpath = ".//label[@id='loginbutton']")
    WebElement loginButtonClick;

    public FeedPage loginFacebook() {
        loginInput.sendKeys(LOGIN);
        passwordInput.sendKeys(PASSWORD);
        loginButtonClick.click();
        return PageFactory.initElements(BrowserManager.browser, FeedPage.class);
    }

}