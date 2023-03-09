package com.cloud.step_definitions;

import com.cloud.pages.FavoritesFiles_CA;
import com.cloud.pages.LoginPage;
import com.cloud.utilities.BrowserUtils;
import com.cloud.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

public class US06_stepDefinitions {
    LoginPage loginPage = new LoginPage();

    FavoritesFiles_CA favoritesFiles_ca = new FavoritesFiles_CA();
    @Given("User on the dashboard page")
    public void user_on_the_dashboard_page() {
      Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
      loginPage.login();

    }


    @When("The User clicks the {string} module")
    public void the_user_clicks_the_module(String files) {
    //favoritesFiles_ca.files.click();
        favoritesFiles_ca.files.sendKeys(files+ Keys.ENTER);

    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
   // favoritesFiles_ca.actionIcon.isDisplayed();
        favoritesFiles_ca.actionIcon.click();


    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String favorite) {


    }

    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String leftFavorite) {
           BrowserUtils.sleep(4);
         favoritesFiles_ca.favorites.sendKeys(leftFavorite+Keys.ENTER);


    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
    favoritesFiles_ca.removeFav.isDisplayed();
    }
}
