package com.cloud.step_definitions;

import com.cloud.pages.DeleteFilesAndFolders_AKS;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US10_StepDefs {

    LoginPage loginPage = new LoginPage();

    DeleteFilesAndFolders_AKS deleteFilesAndFolders_aks = new DeleteFilesAndFolders_AKS();


    @Given("when the user is on the dashboard page")
    public void when_the_user_is_on_the_dashboard_page() {
     //   Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
       loginPage.login();
    }
    @When("the user clicks on the Files module on the top of the screen")
    public void the_user_clicks_on_the_Files_module_on_the_top_of_the_screen() {

        deleteFilesAndFolders_aks.filesPage.click();
        BrowserUtils.sleep(3);
    }
    @And("the user clicks the action-icon  from any file or folder on the right of the page")
    public void the_user_clicks_the_action_icon_from_any_file_or_folder_on_the_right_of_the_page() {

        deleteFilesAndFolders_aks.actionIcon.click();
        BrowserUtils.sleep(3);
    }
    @And("the user chooses the Delete File option")
    public void the_user_chooses_the_Delete_File_option() {

        deleteFilesAndFolders_aks.deleteFolder.click();
        BrowserUtils.sleep(3);
    }
    @When("the user clicks the Deleted Files sub-module on the bottom left of the screen")
    public void the_user_clicks_the_Deleted_Files_sub_module_on_the_bottom_left_of_the_screen() {

        deleteFilesAndFolders_aks.deletedFilesPage.click();
        BrowserUtils.sleep(5);
    }
    @Then("verify the deleted file is displayed on the page")
    public void verify_the_deleted_file_is_displayed_on_the_page() {

    //    String expectedFolderName = deleteFilesAndFolders_aks.folderName.getText();
    //    String actualFolderName = deleteFilesAndFolders_aks.folderNameInDeletedFilesPage.getText();

       // Assert.assertTrue(actualFolderName, expectedFolderName, "Verification failed!");

        Assert.assertTrue(deleteFilesAndFolders_aks.folderNameInDeletedFilesPage.isDisplayed());

      //  Assert.assertTrue(deleteFilesAndFolders_aks.folderName.isDisplayed());

    //  String deletedFolder = DeleteFilesAndFolders_AKS.folderName.getText();

   // Assert.assertTrue(DeleteFilesAndFolders_AKS.folderName.getText().isDisplayed());
    }
}
