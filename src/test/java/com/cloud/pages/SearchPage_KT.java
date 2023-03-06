package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage_KT {

    // Kate's user story

    public SearchPage_KT(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='header-menu unified-search']")
    public WebElement searchIcon;

    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement fileName;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

}
