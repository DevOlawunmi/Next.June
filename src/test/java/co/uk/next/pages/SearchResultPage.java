package co.uk.next.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
@FindBy (tagName = "h1")
    private WebElement pageTitle;

    public void isSearchResultPageDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isCorrectURLDisplayed(String product){
        Assert.assertTrue(driver.getCurrentUrl().contains(product.toLowerCase()));
    }



}
