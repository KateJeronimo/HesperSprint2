package com.cloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddFileToFavorites_Page{


  public AddFileToFavorites_Page(){

  }


  @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement files;

  //@FindBy(xpath = )
  //public WebElement actionIcon;

  @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent' ]/span[1]")
  public WebElement addToFavorites;



 }