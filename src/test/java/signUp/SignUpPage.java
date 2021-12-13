package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public SignUpPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
    }
    @FindBy (css = "[routerlink='/login/signup']")
    private WebElement loginSignup;

    @FindBy (css = "[name='name']")
    private WebElement name;

    @FindBy (css = "[name='email']")
    private WebElement mail;

    @FindBy (css = "[name='password']")
    private WebElement pin;

    private By aboutOffer = By.cssSelector("[href='/about/offer']");

    private By closeFirst = By.xpath("//button[@class='banner-promo-close-button']");
    private By closeSecond = By.xpath("//button[@class='banner-university-close-button']");

    private By buttonSubmit = By.cssSelector("button[type=\"submit\"]");

    public void closeBanner() {
        webDriver.findElement(closeFirst).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeSecond));
        webDriver.findElement(closeSecond).click();
    }

    public void clickRegistration() {
        loginSignup.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(aboutOffer));
    }

    public void fillName(String userName) {
        name.sendKeys(userName);
    }

    public void fillEmail(String email) {
        mail.sendKeys(email);
    }

    public void fillPassword(String password) {
        pin.sendKeys(password);
    }

    public void createAccount() {
        webDriver.findElement(buttonSubmit).click();
    }

    public void toLoseCaptcha() {
        System.out.println("Great CAPTCHA");
    }


}
