package step_definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import modules.CatalogConsulationAction;
import modules.SignInAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.AutomationHomePage;
import page_objects.CatalogPage;
import page_objects.LoginPage;

/**
 * Created by clovisolivier on 01/02/17.
 */
public class loginStep  {
    public WebDriver driver;

    public loginStep(){
        driver = Hooks.driver;
    }

    @Given("^Open login application$")
    public void open_login_application() throws Throwable {
        driver.get("http://facebook.com");
        System.out.println("Open page");
    }

    @When("^I sign in$")
    public void i_sign_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, LoginPage.class);
        PageFactory.initElements(driver, AutomationHomePage.class);

        SignInAction.Execute(driver);
    }

    @When("^I consult my catalogs$")
    public void i_consult_my_catalogs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        PageFactory.initElements(driver, AutomationHomePage.class);
        PageFactory.initElements(driver, CatalogPage.class);
        CatalogConsulationAction.Execute(driver);
    }

}
