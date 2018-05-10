package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    private static ThreadLocal<WebDriver> browser = new ThreadLocal<>();

    public static WebDriver getBrowser() {
        return browser.get();
    }

    public static void setBrowser() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        browser.set(new ChromeDriver());
        getBrowser().manage().window().maximize();
        getBrowser().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        getBrowser().quit();
    }

}
