package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.*;

public class US01_StepDefs {

    @Given("user is log in page")
    public void userIsLogInPage() {
        Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
    }
    LoginPage loginPage = new LoginPage();

    @When("user enters username")
    public void userEntersUsername() {
        loginPage.inputUsernameOrEmail.sendKeys("user223");


    }

    @And("user enters password")
    public void userEntersPassword() {
        loginPage.inputPassword.sendKeys("Userpass123");
        loginPage.logInBtn.click();
    }

    @Then("user should see the dashboard")
    public void userShouldSeeTheDashboard() {

        BrowserUtils.verifyTitle("Dashboard - Trycloud QA");
    }
}
