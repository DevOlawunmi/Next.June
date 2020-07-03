package co.uk.next.stepDefinitions;

import co.uk.next.pages.AccountSummaryPage;
import co.uk.next.pages.BasePage;
import co.uk.next.pages.HomePage;
import co.uk.next.pages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.ashot.Screenshot;

public class AccountsStepsDefinition extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
    AccountSummaryPage accountSummaryPage = PageFactory.initElements(driver, AccountSummaryPage.class);
    @When("I click on any my account link")
    public void iClickOnAnyMyAccountLink() {
        homePage.clickOnAccountLink();
    }
    @And("Log in page is displayed")
    public void logInPageIsDisplayed() {
        //logInPage.isCorrectURLDisplayedForLogin();
        logInPage.isPageTitleDisplayed();
    }

    @And("I enter my {string}")
    public void iEnterMy(String details) {
        logInPage.enterEmailAddress(details);
    }
    @And("I enter the correct {string}")
    public void iEnterTheCorrect(String password) {
        logInPage.enterPassword(password);
    }

    @And("I click on the sign in button")
    public void iClickOnTheSignInButton() {
        logInPage.clickOnSignInButton();
    }

    @Then("my account summary is displayed")
    public void myAccountSummaryIsDisplayed() {
accountSummaryPage.isPageTitleDisplayed();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
accountSummaryPage.takeScreenshot();
    }



}
