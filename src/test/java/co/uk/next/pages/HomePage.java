package co.uk.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }
    @FindBy (id = "sli_search_1")
    private WebElement searchField;
    @FindBy (xpath = "//*[@id=\"module12-4vn5g9dshnhnejemqpwmwt1a8\"]/div/map/area[1]")
    private WebElement summerStylesLink;




    public void enterSearchItem(String product){
        searchField.sendKeys(product);
    }
}
