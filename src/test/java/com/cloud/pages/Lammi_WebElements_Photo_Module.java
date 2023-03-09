package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lammi_WebElements_Photo_Module {

public Lammi_WebElements_Photo_Module(){
    PageFactory.initElements(Driver.getDriver(),this);


}

    @FindBy(xpath = "//a[@href='/index.php/apps/photos/']")
    public WebElement photoModule;
}
