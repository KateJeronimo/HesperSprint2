package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US05_StepDefinitions {

LoginPage loginPage = new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get("https://qa3.trycloud.net/index.php/login?clear=1");
        loginPage.login();

    }

    @Given("the user is on the {string} page")
    public void the_user_is_on_the_page(String string) {

    }

    @When("the user selects a file")
    public void the_user_selects_a_file() {

    }

    @When("clicks the {string} button")
    public void clicks_the_button(String string) {

    }

    @Then("the file should be added to the user's favorites list")
    public void the_file_should_be_added_to_the_user_s_favorites_list() {

    }

    @Then("the user should see a confirmation message")
    public void the_user_should_see_a_confirmation_message() {

    }


    @When("the user clicks action-icon from any file on the page")
    public void theUserClicksActionIconFromAnyFileOnThePage() {
    }
}
