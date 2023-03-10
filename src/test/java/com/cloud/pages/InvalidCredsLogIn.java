package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidCredsLogIn {

    public InvalidCredsLogIn() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPass;

    @FindBy(id = "submit-form")
    public WebElement logInButton;



    public void login() {
        this.inputUsername.sendKeys("User9");
        this.inputPass.sendKeys("Userpass123");
        this.logInButton.click();
    }

    public void login(String user, String pass) {
        this.inputUsername.sendKeys(user);
        this.inputPass.sendKeys(pass);
        this.logInButton.click();
    }
}