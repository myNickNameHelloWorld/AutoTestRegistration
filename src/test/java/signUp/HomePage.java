package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
    }

    private By buttonStart = By.id("button_menu_start_learning_unauthorized_user");
    private By buttonWelcomeStart = By.id("id_button_jr_welcome_start_learning_1");



    public void open() {
        webDriver.get("https://javarush.ru/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonStart));
    }
    public void getStarted() {
        webDriver.findElement(buttonStart).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonWelcomeStart));
    }
}
