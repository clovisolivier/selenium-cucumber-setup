package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by clovisolivier on 31/01/17.
 */
public class AutomationHomePage extends BaseClass {

    @FindBy(how=How.ID, using="js-orders-count")
    public static WebElement order_count;

    @FindBy(how=How.LINK_TEXT, using="Notifications")
    public static WebElement contact_us;

    @FindBy(how=How.ID, using="item-products")
    public static WebElement catalogs;

    public static class HeaderPage{

        @FindBy(how=How.LINK_TEXT, using="LENGOW")
        public static WebElement lengow;

        @FindBy(how=How.ID, using="item-products")
        public static WebElement catalogs;

        @FindBy(how=How.ID, using="item-channels")
        public static WebElement channels;


    }
    public AutomationHomePage(WebDriver driver) {
        super(driver);
    }

    public static boolean isInitialized(){
        return order_count.isDisplayed()  ;
    }
}
