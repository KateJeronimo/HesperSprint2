package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.pages.MainModulesPage_FJ;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class US12_StepDefs {

    LoginPage loginPage = new LoginPage();
    MainModulesPage_FJ mainModulesPage_FJ = new MainModulesPage_FJ();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.inputUsernameOrEmail.sendKeys("user34");
        loginPage.inputPassword.sendKeys("Userpass123");
        loginPage.logInBtn.click();

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        mainModulesPage_FJ.clicksFile.click();
    }

    @And("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {
        mainModulesPage_FJ.clicksSetting.click();

    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        mainModulesPage_FJ.clickCheckbox.click();

    }




}
