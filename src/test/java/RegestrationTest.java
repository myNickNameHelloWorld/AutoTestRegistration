import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import javax.swing.*;
import java.time.Duration;
import java.util.Random;

public class RegestrationTest extends BrowserSettings {
    @Test
    public void firstTest() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button_menu_start_learning_unauthorized_user")));

        System.out.println("Click on start");
        webDriver.findElement(By.id("button_menu_start_learning_unauthorized_user")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_button_jr_welcome_start_learning_1")));

        System.out.println("Click on login");
        webDriver.findElement(By.id("id_button_jr_welcome_proceeding_to_login")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button_sign_in_vkontakte")));

        System.out.println("Close banner");
        webDriver.findElement(By.xpath("//button[@class='banner-promo-close-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"banner-university-close-button\"]")));
        webDriver.findElement(By.xpath("//button[@class=\"banner-university-close-button\"]")).click();

        System.out.println("Click on registration");
        webDriver.findElement(By.cssSelector("[routerlink=\"/login/signup\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='/about/offer']")));

        System.out.println("Registration field ");
        Random rnd = new Random();
        int n = rnd.nextInt(99) + 1;

        webDriver.findElement(By.cssSelector("[name='name']")).sendKeys("Jojo Bean");

        webDriver.findElement(By.cssSelector("[name='email']")).sendKeys("jojo123" + n + "@mail.ru");

        webDriver.findElement(By.cssSelector("[name='password']")).sendKeys("qwe" + n);

        System.out.println("Click on create account");
        webDriver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

        System.out.println("Great CAPTCHA");
    }
}
