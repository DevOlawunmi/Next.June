package co.uk.next.stepDefinitions;

import co.uk.next.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends BasePage {
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
    public void iEnterInTheSearchField(String arg0) {
    }

    @Then("a list of {string} is displayed")
    public void aListOfIsDisplayed(String arg0) {
    }

    @And("I click on any of the displayed products")
    public void iClickOnAnyOfTheDisplayedProducts() {
    }


}
