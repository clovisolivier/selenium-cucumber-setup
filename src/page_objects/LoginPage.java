package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

/**
 * Created by clovisolivier on 31/01/17.
 */

public class LoginPage extends BaseClass{

    public LoginPage(WebDriver driver){
        super(driver);
        //assertTrue(this.username.isDisplayed());
    }

    @FindBy(how=How.ID, using="username")
    public static WebElement username;
    @FindBy(how=How.ID, using="password")
    public static WebElement password;
    @FindBy(how=How.ID, using="submit-login")
    public static WebElement signin_button;
    @FindBy(how=How.CLASS_NAME, using="mod-danger")
    public static WebElement alert;

    public static boolean isInitialized(){
        return username.isDisplayed() && !alert.isDisplayed() ;
    }
}
