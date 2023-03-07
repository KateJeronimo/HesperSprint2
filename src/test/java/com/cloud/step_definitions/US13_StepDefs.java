package com.cloud.step_definitions;

import com.cloud.pages.LoginPage;
import com.cloud.pages.SearchPage_KT;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.ConfigurationReader;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US13_StepDefs {

    SearchPage_KT searchPage_kt = new SearchPage_KT();
    LoginPage loginPage = new LoginPage();


    @Given("user is logged in with valid credentials")
    public void user_Is_Logged_In_With_Valid_Credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("website"));
        loginPage.login(ConfigurationReader.getProperty("userName"),ConfigurationReader.getProperty("userPassword"));
    }


    @When("user is on Files page")
    public void user_Is_On_Files_Page() {
        Driver.getDriver().get("https://qa.trycloud.net/index.php/apps/files/?dir=/&fileid=54952");
    }


    @When("user clicks on the Search icon")
    public void user_clicks_on_the_search_icon() {
        searchPage_kt.searchIcon.click();
        BrowserUtils.sleep(2);
    }


    @When("user searches for one of the files from Files page")
    public void user_searches_for_one_of_the_files_from_files_page() {
        String itemToSearch = searchPage_kt.fileName.getText();
        searchPage_kt.searchBox.sendKeys(itemToSearch);
        BrowserUtils.sleep(3);

    }


    @Then("user should see the file in the search results")
    public void user_should_see_the_file_in_the_search_results() {

        String searchItem = searchPage_kt.fileName.getText();

        Assert.assertEquals(searchItem, searchPage_kt.result.getText());

    }


}
