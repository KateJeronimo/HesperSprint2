package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.pages.Upload_File_Inside_Folder_DO;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class US09_StepDef {

    Upload_File_Inside_Folder_DO upload_file_inside_folder_do= new Upload_File_Inside_Folder_DO();
    LoginPage loginPage = new LoginPage();


    @Given("user is on the Dashboard page")
    public void userOnTheDashboardPage() {

        // Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
        loginPage.login();

    }




    @When("The user clicks the {string} Module")
    public void the_user_clicks_the_module(String file) {

     upload_file_inside_folder_do.filesPage.sendKeys(file + Keys.ENTER) ;
    }



    @And("user choose a folder from the page")
    public void userChooseAFolderFromThePage() {
   upload_file_inside_folder_do.fileFinder.click();
    }




    @And("user clicks the add icon on the top")
    public void userClicksTheAddIconOnTheTop() {
        upload_file_inside_folder_do.plusIcon.click();
    }


    @When("the user uploads a file with the upload file option")
    public void theUserUploadsAFileWithTheUploadFileOption() {
    }

    @Then("Verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
    }


}









