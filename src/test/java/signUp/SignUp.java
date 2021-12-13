package signUp;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import java.util.Random;

public class SignUp extends BrowserSettings {
    @Test
    public void firstTest() {

        HomePage homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.open();
        homePage.getStarted();

        WelcomePage welcomePage = PageFactory.initElements(webDriver, WelcomePage.class);
        welcomePage.clickNextPage();

        SignUpPage signUpPage = PageFactory.initElements(webDriver, SignUpPage.class);
        signUpPage.closeBanner();
        signUpPage.clickRegistration();

        Random rnd = new Random();
        int n = rnd.nextInt(99) + 1;

        signUpPage.fillName("Jojo Bean");

        String email = "jojo123" + n + "@mail.ru";
        String password = "qwe" + n;

        signUpPage.fillEmail(email);

        signUpPage.fillPassword(password);

        signUpPage.createAccount();

        signUpPage.toLoseCaptcha();
    }
}
