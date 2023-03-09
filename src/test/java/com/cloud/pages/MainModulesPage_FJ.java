package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainModulesPage_FJ {
    public MainModulesPage_FJ(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//header/div[1]/ul[1]/li[2]/a[1]")
    public WebElement clicksFile;

    @FindBy(xpath = "//button[contains(text(),'Settings')]")
    public WebElement clicksSetting;

    @FindBy(xpath = "//label[contains(text(),'Show rich workspaces')]")
    public WebElement clickCheckbox;



}
