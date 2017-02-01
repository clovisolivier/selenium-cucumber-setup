package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.AutomationHomePage;
import page_objects.LoginPage;

/**
 * Created by clovisolivier on 01/02/17.
 */
public class SignInAction {
    public static void Execute(WebDriver driver) throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);
        assert (LoginPage.isInitialized());
        LoginPage.username.sendKeys("toto@yopmail.com");
        LoginPage.password.sendKeys("toto");
        LoginPage.signin_button.click();

        wait.until(ExpectedConditions.elementToBeClickable(AutomationHomePage.order_count));
        assert(AutomationHomePage.isInitialized());
    }
}
