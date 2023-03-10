package com.cloud.step_definitions;

import com.cloud.pages.FilesModulePage_AP;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class US04_StepDefs {

    FilesModulePage_AP filesModulePage_ap = new FilesModulePage_AP();
    LoginPage loginPage = new LoginPage();

    @When("the user is accessing the {string} module")
    public void theUserClicksModule(String files) {
        loginPage.login();
        filesModulePage_ap.filesModule.sendKeys(files + Keys.ENTER);
    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {

        BrowserUtils.verifyTitle(expectedTitle);
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {

        BrowserUtils.waitFor(2);
        filesModulePage_ap.FilesCheckBox.click();
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {

        for (WebElement each : filesModulePage_ap.availableCheckboxes){
            Assert.assertTrue(each.isSelected());
        }


    }

}

/*
The method iterates through all the checkboxes and checks if each one is selected using the isSelected() method
 of the WebElement class. The Assert.assertTrue() method is used to check whether the checkbox is selected or not.
If all the checkboxes are selected, the method will pass and no error will be thrown.
 */