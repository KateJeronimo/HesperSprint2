package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModules_LH {

    public MainModules_LH(){

    PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (id = "appMenu")
    public List<WebElement> mainModules;

    @FindBy (xpath = "(//li/a[@aria-label='Dashboard'])[1]")
    public WebElement dashboardModule;

    @FindBy (xpath = "(//li/a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy (xpath = "(//li/a[@aria-label='Photos'])[1]")
    public WebElement photosModule;

    @FindBy (xpath = "(//li/a[@aria-label='Activity'])[1]")
    public WebElement activityModule;

    @FindBy (xpath = "(//li/a[@aria-label='Talk'])[1]")
    public WebElement TalkModule;

    @FindBy (xpath = "(//li/a[@aria-label='Mail'])[1]")
    public WebElement mailModule;

    @FindBy (xpath = "(//li/a[@aria-label='Contacts'])[1]")
    public WebElement contactsModule;

    @FindBy (xpath = "(//li/a[@aria-label='Circles'])[1]")
    public WebElement circlesModule;

    @FindBy (xpath = "(//li/a[@aria-label='Calendar'])[1]")
    public WebElement calendarModule;

    @FindBy (xpath = "(//li/a[@aria-label='Deck'])[1]")
    public WebElement deckModule;










}
