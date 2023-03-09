package com.cloud.pages;

import com.cloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavoritesFiles_CA {

    public FavoritesFiles_CA() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@data-id='files']/a)[1]")
    public WebElement files;

    @FindBy(xpath = "//a[@class='action action-menu permanent']")
    public WebElement actionIcon;

    @FindBy(xpath = "//div[@class='favorite-mark permanent']")
    public WebElement star;




    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
     public WebElement favorites;

    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeFav;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement deleteFavorites;

    @FindBy(xpath="//span[.='Add to favorites']")
    public WebElement addToFavorites;

}
