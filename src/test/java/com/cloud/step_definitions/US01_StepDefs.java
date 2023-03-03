package com.cloud.step_definitions;

import io.cucumber.java.en.*;

public class US01_StepDefs {

    @Given("user on the login page http:\\/\\/qa3.trycloud.net\\/index.php\\/login?clear={int}")
    public void user_on_the_login_page_http_qa3_trycloud_net_index_php_login_clear(Integer int1) {

    }

    @When("user use username {string} and passcode “<password>\"")
    public void user_use_username_and_passcode_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
