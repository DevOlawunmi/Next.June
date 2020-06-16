package co.uk.next.stepDefinitions;

import co.uk.next.pages.BasePage;
import co.uk.next.pages.HomePage;
import co.uk.next.pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class StepDefinitions extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage= PageFactory.initElements(driver, SearchResultPage.class);
    @Given("I navigate to next website")
    public void i_navigate_to_next_website() {
launchURL();
    }

    @When("I click on the homepage header")
    public void i_click_on_the_homepage_header() {

    }

    @Then("a list of summer essentials is displayed")
    public void a_list_of_summer_essentials_is_displayed() {

    }

    @Then("I click on any")
    public void i_click_on_any() {

    }

    // Product Search
    @When("I enter {string} in the search field")
    public void iEnterInTheSearchField(String product) {
        homePage.enterSearchItem(product);
    }
    @And("I click on the search button")
    public void iClickOnTheSearchButton() {
        homePage.clickOnSearchButton();
    }

    @Then("a list of {string} is displayed")
    public void aListOfIsDisplayed(String product) {
       searchResultPage.isCorrectURLDisplayed(product);
       searchResultPage.isSearchResultPageDisplayed();
    }

    @And("I click on any of the displayed products")
    public void iClickOnAnyOfTheDisplayedProducts() {
    }

//Search Navigation Links
    @When("I click on any departmental link")
    public void iClickOnAnyDepartmentalLink() {
homePage.clickOnAnyHeader();
    }

    @Then("a list of items in the department is displayed")
    public void aListOfItemsInTheDepartmentIsDisplayed() {
    }

    @And("I click on a random product")
    public void iClickOnARandomProduct() {

    }
}
