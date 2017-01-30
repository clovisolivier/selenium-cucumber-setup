import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
/**
 * Created by clovisolivier on 30/01/17.
 */
public class LoginPage extends PageObject{

    private WebElement email;

    private WebElement pass;

    private WebElement loginbutton;

    public LoginPage(WebDriver driver){
        super(driver);
        assertTrue(this.loginbutton.isDisplayed());
    }

    public void enterLogin(String login, String password){
        email.clear();
        email.sendKeys(login);

        pass.clear();
        pass.sendKeys(password);
    }

    public void submit(){
        loginbutton.click();
        //return new ReceiptPage(driver);
    }
}
