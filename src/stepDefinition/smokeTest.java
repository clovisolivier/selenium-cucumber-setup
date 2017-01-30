/**
 * Created by clovisolivier on 30/01/17.
 */
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class smokeTest {

    WebDriver driver;

    @Given("^Open firefox and start application$")
    public void open_firefox_and_start_application() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
    }

    @When("^I enter valid username and unvalid password$")
    public void i_enter_valid_username_and_unvalid_password() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("clovisdu54@hotmail.fr");
        driver.findElement(By.id("pass")).sendKeys("totototor");
    }


    @When("^I enter valid \"(.*?)\" and unvalid \"(.*?)\"$")
    public void i_enter_valid_and_unvalid(String username, String password) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
    }


    @Then("^user should not be able to login successfully$")
    public void user_should_not_be_able_to_login_successfully() throws Throwable {
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("^application should be closed$")
    public void application_should_be_closed() throws Throwable {
        driver.quit();
    }
}
