package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class Upload_File_Inside_Folder_DO {



    public Upload_File_Inside_Folder_DO(){
       PageFactory.initElements(Driver.getDriver(),this);

   }

    //go to Files page

    @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement filesPage;


    @FindBy (xpath = "//a[@class='button new']/span[1]")
    public WebElement iconButtonAdd;


    @FindBy(xpath = "//div[@class='thumbnail'][1]")
    public WebElement fileFinder;

    @FindBy(xpath  ="//span[@class='icon icon-add']")
    public WebElement plusIcon;
}

