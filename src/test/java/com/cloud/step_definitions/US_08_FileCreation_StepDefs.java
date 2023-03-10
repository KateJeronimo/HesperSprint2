package com.cloud.step_definitions;

import com.cloud.pages.FileCreationPage;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_08_FileCreation_StepDefs {
    LoginPage login = new LoginPage();
    FileCreationPage FileCreationPage = new FileCreationPage();

    @Given("User is login on the dashboard")
    public void userIsLoginOnTheDashboard() {
   //     Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
        login.login();
    }

   @When("user click on the file module")
   // public void userIsOnTheFileModule() {
    //    FileCreationPage.fileModule.click();
   // }

   @And("user click On all files")
   public void userClickOnAllFiles() {
   //    FileCreationPage.AllFiles.click();
       FileCreationPage.fileModule.click();
    }

    @When("user click on the icon add button")
    public void userClickOnTheButton() {
        FileCreationPage.iconAdd.click();
    }

    @And("user click on new folder and enter the name")
    public void userClickOnNewFolderAndEnterTheName() {
        FileCreationPage.NewFolder.click();
        FileCreationPage.FolderInputBox.sendKeys("Hesper Folder" + Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @Then("user should see the new folder display on the file module section")
    public void userShouldSeeTheNewFolderDisplayOnTheFileModuleSection() {
        FileCreationPage.folder.isDisplayed();
    }



}
