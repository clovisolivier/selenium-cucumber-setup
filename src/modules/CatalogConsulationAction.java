package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_objects.AutomationHomePage;
import page_objects.CatalogPage;

/**
 * Created by clovisolivier on 01/02/17.
 */
public class CatalogConsulationAction {
    public static void Execute(WebDriver driver) throws Exception{
        WebDriverWait wait = new WebDriverWait(driver,10);
        assert(AutomationHomePage.isInitialized());
        assert(AutomationHomePage.catalogs.isDisplayed());
        AutomationHomePage.catalogs.click();

        wait.until(ExpectedConditions.elementToBeClickable(CatalogPage.catalog1));
        assert(CatalogPage.isInitialized());
    }
}
