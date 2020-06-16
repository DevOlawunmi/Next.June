package co.uk.next.pages;

import co.uk.next.common.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements (driver, this);
    }
    @FindBy (id = "sli_search_1")
    private WebElement searchField;
    @FindBy (className = "SearchButton")
    private WebElement searchButton;
    @FindBy (xpath = "//*[@id=\"module12-4vn5g9dshnhnejemqpwmwt1a8\"]/div/map/area[1]")
    private WebElement summerStylesLink;
    @FindBy (className = "PrimarynavlinksLink")
    private List<WebElement> searchLinks;
    @FindBy (xpath = "/html/body/header/div/section/section[3]/ul/li[1]/a")
    private WebElement accountLink;




    public void enterSearchItem(String product){
        searchField.sendKeys(product);
    }
    public SearchResultPage clickOnSearchButton()
    {searchButton.click();
    return new SearchResultPage(driver);
    }
    public SearchResultPage clickOnAnyHeader(){
        Random random = new Random();
       int randomNumber =  random.nextInt(searchLinks.size()-1);
       searchLinks.get(randomNumber).click();
       return new SearchResultPage(driver);
    }
    public void clickOnAccountLink(){
        accountLink.click();
    }
}
