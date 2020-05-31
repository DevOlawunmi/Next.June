package co.uk.next.pages;

import co.uk.next.common.DriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends DriverLib {
    String BASE_URL =   "https://www.next.co.uk/";
    public Select select;

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }

    public void selectElementByValue(WebElement element, String value){
        select=new Select(element);
        select.selectByValue(value);
    }
    public void selectElementByText(WebElement element, String text){
        select=new Select(element);
        select.selectByValue(text);
    }
    public void waitForElementToBeDisplayed(WebElement element){
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
