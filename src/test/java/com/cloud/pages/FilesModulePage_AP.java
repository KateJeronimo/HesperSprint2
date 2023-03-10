package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesModulePage_AP {

    // Ana's user story

    public FilesModulePage_AP() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='appmenu']/li[2]/a")   //"//a[@aria-label='Files']"
    public WebElement filesModule;

    @FindBy(xpath = "//*[@for='select_all_files']")
    public WebElement FilesCheckBox;

    @FindBy(id = "//input[@class='selectCheckBox checkbox']")
    public List<WebElement> availableCheckboxes;





}
