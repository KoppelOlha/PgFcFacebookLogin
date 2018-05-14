package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    private static ThreadLocal<WebDriver> browser = new ThreadLocal<>();

    public static WebDriver getBrowser() {
        return browser.get();
    }

    public static void setBrowser() {
        String browserType = System.getProperty("browser");
        switch (browserType) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
                browser.set(new ChromeDriver());
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
                browser.set(new FirefoxDriver());
                break;
            case "IE":
                System.setProperty("webdriver.ie.driver", "c:/IEDriverServer.exe");
                browser.set(new InternetExplorerDriver());
                break;
            default:
                System.out.println("Wrong browser");
        }

                getBrowser().manage().window().maximize();
                getBrowser().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    public static void closeBrowser() {
        getBrowser().quit();
    }

}
