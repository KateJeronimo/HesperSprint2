package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileCreationPage {

    public FileCreationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement fileModule;

    //@FindBy(xpath = "//a[@class='nav-icon-files svg active']")
    //public WebElement AllFiles;

    @FindBy(xpath = "(//div[@class='favorite-mark '])[1]")
    public WebElement folder;

    @FindBy(xpath = "//a[@class='button new']/span[1]")
    public WebElement iconAdd;

    @FindBy(xpath = "//span[normalize-space()='New folder']")
    public WebElement NewFolder;

    @FindBy(id="view13-input-folder")
    public WebElement FolderInputBox;



    ///    span[@class='displayname'])[2]
}

