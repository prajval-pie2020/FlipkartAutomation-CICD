package StepDefinitions;

import Baseclass.Library;
import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SearchMobileTestCase extends Library {
    SearchPage sp;
    @Given("Launch the flipkart Application")
    public void launch_the_flipkart_application() throws IOException {
            launchapplication();
    }
    @When("Close the popup")
    public void close_the_popup() {
       System.out.println(driver.getTitle());

    }
    @Then("It should Navigate to the home page")
    public void it_should_navigate_to_the_home_page() {
         sp = new SearchPage(driver);
         sp.Homescreen();
    }
    @Given("User enter the Text in the Search Field")
    public void user_enter_the_text_in_the_search_field() {
       sp.Search("Mobile");
    }
    @When("Click the search button")
    public void click_the_search_button() {
       sp.ClickSearch();
    }
    @Then("It should Navigate to the search page and display result")
    public void it_should_navigate_to_the_search_page_and_display_result() {
        sp.Result();
    }

}
