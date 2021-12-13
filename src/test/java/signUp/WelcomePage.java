package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public WelcomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
    }

    private By buttonLogin = By.id("id_button_jr_welcome_proceeding_to_login");
    private By vk = By.id("button_sign_in_vkontakte");

    public void clickNextPage() {
        webDriver.findElement(buttonLogin).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(vk));
    }
}
