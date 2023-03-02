package com.cloud.pages;


import com.cloud.utilities.Driver;
import io.opentelemetry.sdk.metrics.internal.view.ExponentialHistogramAggregation;
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
    public WebElement LogInBtn;

@FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//p[@class='info']/a")
    public WebElement tryCloudQALink;

@FindBy(xpath = "(//div)[6]/a[2]")
    public WebElement getLogInWithDeviceLink;

//TODO please find the link when you hover over the email or password window.
 @FindBy()
    public WebElement pleaseFillOutFieldPopOut;

 @FindBy(xpath = "//a[@href='#']")
    public WebElement showPasswordIconBtn;



    }


