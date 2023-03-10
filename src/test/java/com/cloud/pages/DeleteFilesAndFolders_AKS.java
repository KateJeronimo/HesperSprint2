package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFilesAndFolders_AKS {

    public DeleteFilesAndFolders_AKS(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //go to Files page

    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement filesPage;

    // go to Action Icon on first folder

    @FindBy(xpath = "(//a[@class= 'action action-menu permanent'])[1]")
    public WebElement actionIcon;


    // go to Delete Folder option

   @FindBy(xpath = "(//td[@class='filename ui-draggable ui-draggable-handle'])[1]")
    public WebElement folderName; //specific file



    @FindBy(xpath = "(//a[@class= 'menuitem action action-delete permanent'])")
    public WebElement deleteFolder; // locator to click to delete

    // go to Deleted Files page

    @FindBy(xpath = "(//a[@class='nav-icon-trashbin svg'])")
    public WebElement deletedFilesPage;

    // verify deleted folder is displayed on the page

    @FindBy(xpath = "(//a[@class= 'name'])[last()]")
    public WebElement folderNameInDeletedFilesPage;









}
