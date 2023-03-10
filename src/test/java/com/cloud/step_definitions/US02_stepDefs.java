package com.cloud.step_definitions;

import com.cloud.pages.InvalidCredsLogIn;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US02_stepDefs {


        @Given("user on the login")
        public void userIsLogInPage() {
            Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
        }

        InvalidCredsLogIn invalidloginPage = new InvalidCredsLogIn();

        @When("user enter invalid")
        public void userEntersUsernameAndPassword() {
           invalidloginPage.inputUsername.sendKeys("Userpass123");

            invalidloginPage.inputPass.sendKeys("Wrong");
        }

        @And("user click the login button")
        public void userClickTheLoginButton() {
            BrowserUtils.sleep(1);
            invalidloginPage.logInButton.click();
        }

        @Then("verify message should be displayed")
        public void verifyMessageShouldBeDisplayed() {
            BrowserUtils.sleep(3);
            Driver.closeDriver();
        }
    }
