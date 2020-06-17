package co.uk.next.pages;

import co.uk.next.common.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
