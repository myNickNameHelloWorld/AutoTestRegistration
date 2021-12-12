import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BrowserSettings {
    WebDriver webDriver;
    WebDriverWait wait;

    @BeforeEach
    public void setUpBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/nickolai/Рабочий стол/chromedriver");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        //webDriver.manage().window().maximize();
        webDriver.get("https://javarush.ru/");
    }

    @AfterEach
    public void closeBrowser() {
        webDriver.quit();
    }
}
