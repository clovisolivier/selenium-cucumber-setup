package page_objects;

import org.openqa.selenium.WebDriver;

/**
 * Created by clovisolivier on 31/01/17.
 */

public abstract class BaseClass {
    public static WebDriver driver;
    public static boolean bResult;
    public BaseClass(WebDriver driver){
        BaseClass.driver = driver;
        BaseClass.bResult = true;
    }
}
