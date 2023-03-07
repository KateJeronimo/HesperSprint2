package com.cloud.step_definitions;

import com.cloud.pages.DeleteFilesAndFolders_AKS;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US10_stepDefs {

    LoginPage login = new LoginPage();

    DeleteFilesAndFolders_AKS deleteFiles = new DeleteFilesAndFolders_AKS();

    @Given("user on the dashboard page")

    public void navigateToDashboard(){
        Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
        login.login();
    }


    @When("the user clicks on the Files module at the top of the screen")
    public void goToFilesPage(){

    }

    @And("the user clicks on the action-icon from any file or folder from the page")
    public void clickOnActionIcon(){

    }

    @And("the user chooses Delete File option")
    public void DeleteFileOption(){

    }

    @When("the user clicks the Deleted Files submodule on the bottom left of the screen")
    public void DeletedFilesPage(){

    }

    @Then("verify the deleted file is displayed on the page")
    public void FileIsDisplayed(){


    }









}
