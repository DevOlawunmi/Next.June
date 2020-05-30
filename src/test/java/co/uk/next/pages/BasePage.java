package co.uk.next.pages;

import co.uk.next.common.DriverLib;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLib {
    String BASE_URL =   "https://www.next.co.uk/";
    public Select select;

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }
}
