package co.uk.next.pages;

import co.uk.next.common.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class LogInPage extends BasePage {
    public LogInPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
           }
    @FindBy(tagName = "h2")
    private WebElement pageTitle;
    @FindBy (xpath = "//*[@id=\"EmailOrAccountNumber\"]")
    private WebElement emailInputField;
    @FindBy (id = "Password")
    private WebElement passwordInputField;
    @FindBy(id = "SignInNow")
    private WebElement submitButton;


    public void isCorrectURLDisplayedForLogin(String account){
        String  title =driver.getCurrentUrl();
        Assert.assertTrue(title.contains(account.toLowerCase()));
    }
    public void isPageTitleDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void enterEmailAddress (String details){
        emailInputField.sendKeys(details);
    }
    public void enterPassword (String password){
        passwordInputField.sendKeys(password);
    }
    public AccountSummaryPage clickOnSignInButton(){
        submitButton.click();
        return new AccountSummaryPage(driver);
    }

}
