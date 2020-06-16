package co.uk.next.stepDefinitions;

import co.uk.next.pages.BasePage;
import co.uk.next.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class AccountsStepsDefinition extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    @When("I click on any my account link")
    public void iClickOnAnyMyAccountLink() {
        homePage.clickOnAccountLink();
    }

    @And("I enter my {string}")
    public void iEnterMy(String arg0) {
        
    }

    @And("I click on the sign in button")
    public void iClickOnTheSignInButton() {
        
    }

    @Then("my account summary is displayed")
    public void myAccountSummaryIsDisplayed() {

    }
}
