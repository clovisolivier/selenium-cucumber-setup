package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by clovisolivier on 01/02/17.
 */
public class CatalogPage extends BaseClass {
    public CatalogPage(WebDriver driver){
        super(driver);
    }

    @FindBy(how= How.XPATH, using="/html/body/div[1]/div[1]/div[3]/div/a[1]")
    public static WebElement catalog1;

    public static boolean isInitialized(){
        return catalog1.isDisplayed()  ;
    }
}
