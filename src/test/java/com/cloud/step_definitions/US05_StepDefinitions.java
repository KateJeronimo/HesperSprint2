package com.cloud.step_definitions;

import com.cloud.pages.AddFileToFavorites_Page;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.Collection;

public class US05_StepDefinitions {


    public class User {
        public Collection<Object> addFileToFavorites() {
            return null;
        }
    }

    private class AddFileToFavorites {
    }

    AddFileToFavorites_Page addFileToFavorites_page = new AddFileToFavorites_Page();

    LoginPage loginPage = new LoginPage();
    

    AddFileToFavorites addFileToFavorites = new AddFileToFavorites();
    User user = new User();


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.getDriver().get("http://qa3.trycloud.net/index.php/apps/dashboard/");
        loginPage.login();
    }

    /*@When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        addFileToFavorites_page.files.click();
    }

     */
    @When("the user clicks action-icon from any file on the page")
    public void theUserClicksActionIconFromAnyFileOnThePage() {
        //addFileToFavorites_page.actionIcon.click();
    }

    @When("clicks the {string} button")
    public void clicks_the_button(String string) {
        addFileToFavorites_page.addToFavorites.click();

    }
    @Then("the file should be added to the user's favorites list")
    public void the_file_should_be_added_to_the_user_s_favorites_list() {

        Object files = null;
        Assert.assertTrue(user.addFileToFavorites().contains(files));

    }
    @Then("the user should see a confirmation message")
    public void the_user_should_see_a_confirmation_message() {


    }

}
