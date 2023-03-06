package com.cloud.pages;


import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement inputUsernameOrEmail;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement logInBtn;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//p[@class='info']/a")
    public WebElement tryCloudQALink;

    @FindBy(xpath = "(//div)[6]/a[2]")
    public WebElement getLogInWithDeviceLink;

//TODO please find the link when you hover over the email or password window.
  //  @FindBy()
  //  public WebElement pleaseFillOutFieldPopOut;

    @FindBy(xpath = "//a[@href='#']")
    public WebElement showPasswordIconBtn;

    public void login(){
        this.inputUsernameOrEmail.sendKeys("User199");
        this.inputPassword.sendKeys("UserPass123");
        this.logInBtn.click();
    }

    /**
     * This method will log in with credentials that are
     * provided in the method at the time of calling it
     * @param user
     * @param pass
     */
    public void login(String user, String pass){
        this.inputUsernameOrEmail.sendKeys(user);
        this.inputPassword.sendKeys(pass);
        this.logInBtn.click();
    }

    }


