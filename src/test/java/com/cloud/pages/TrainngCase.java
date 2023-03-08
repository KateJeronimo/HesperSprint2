package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainngCase {

    public TrainngCase(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class= 'action action-menu permanent'])[1]")
    public WebElement actionIcon;

    @FindBy(id = "app-settings")
    public WebElement appSettingBtn;
}
