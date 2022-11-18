package co.uk.rightmove.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class PropertySearchSteps {

    @Given("I navigate to the homepage")
    public void iNavigateToTheHomepage()
    {
       WebDriver driver = WebDriverManager.chromedriver().create();

        driver.navigate().to("https://www.rightmove.co.uk/");
    }

    @When("I enter {string} in the search field")
    public void i_enter_in_the_search_field(String string) {

    }

    @When("I click on For sale button")
    public void i_click_on_for_sale_button() {

    }

    @When("I select radius {string} of the location")
    public void i_select_radius_of_the_location(String string) {

    }

    @When("minimum price range of {string}")
    public void minimum_price_range_of(String string) {

    }

    @When("maximum price range of {string}")
    public void maximum_price_range_of(String string) {

    }

    @When("I select {string} as the minimum no of bedroom")
    public void i_select_as_the_minimum_no_of_bedroom(String string) {

    }

    @When("I select {string} as the maximum no of bedroom")
    public void i_select_as_the_maximum_no_of_bedroom(String string) {

    }

    @When("I select {string} as the property type")
    public void i_select_as_the_property_type(String string) {

    }

    @When("I select {string} as Added to site option")
    public void i_select_as_added_to_site_option(String string) {

    }

    @When("I click on Find properties button")
    public void i_click_on_find_properties_button() {

    }

    @When("I ensure that Search result page is displayed")
    public void i_ensure_that_search_result_page_is_displayed() {

    }

    @When("I click on the second result")
    public void i_click_on_the_second_result() {

    }

    @Then("the details of the property is displayed")
    public void the_details_of_the_property_is_displayed() {

    }

}
