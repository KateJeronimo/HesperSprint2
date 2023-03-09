package com.cloud.step_definitions;

import com.cloud.pages.Lammi_WebElements_Photo_Module;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US14_PhotoModuleDefinitions_Lammi {

    @Given("User on the login page {string}")
    public void user_on_the_login_page(String Website) {
        Driver.getDriver().get(Website);

    }

    LoginPage loginPage = new LoginPage();

    @When("User enter {string} and {string}")
    public void user_enter_and(String username, String password) {

        loginPage.inputUsernameOrEmail.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);


    }
    @When("User click the login button")
    public void user_click_the_login_button() {
        loginPage.logInBtn.click();

    }


    Lammi_WebElements_Photo_Module lammi_webElements_photo_module = new Lammi_WebElements_Photo_Module();
    @And("User clicks on Photo module")
    public void userClicksOnPhotoModule() {
        lammi_webElements_photo_module.photoModule.click();

    }
}
