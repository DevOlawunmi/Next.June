package co.uk.next.pages;

import co.uk.next.common.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage extends BasePage {
    public AccountSummaryPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (tagName = "h2")
    private WebElement pageTitle;

    public void isPageTitleDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
}
