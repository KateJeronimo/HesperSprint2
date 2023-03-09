package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.pages.MainModules_LH;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US03_StepDefs {

    MainModules_LH mainModules_LH = new MainModules_LH();
    LoginPage loginPage = new LoginPage();

    @Given("user is logged in with valid credentials Leila's user story")
    public void userIsLoggedInWithValidCredentialsLeilaSUserStory() {

        Driver.getDriver().get(ConfigurationReader.getProperty("website"));
        loginPage.login();

    }

    @When("the user is on the Dashboard page Leila's user story")
    public void theUserIsOnTheDashboardPageLeilaSUserStory() {
        mainModules_LH.dashboardModule.click();
    }

    @Then("user should be able to see all of the main modules:")
    public void userShouldBeAbleToSeeAllOfTheMainModules(List<String> mainModulesTable) {

        System.out.println("mainModules = " + mainModulesTable);
        Assert.assertTrue(mainModulesTable.containsAll(mainModules_LH.mainModules));






    }





}
