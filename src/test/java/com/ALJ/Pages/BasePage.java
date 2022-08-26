package com.ALJ.Pages;

import com.ALJ.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage { public BasePage() {
    PageFactory.initElements(Driver.get(), this);
}

@FindBy(xpath = "mat-input-0")
    public WebElement SearchBox;

    @FindBy(xpath = "//button[@class=\"icon-button icon-button--accent\"]")
    public WebElement SearcButton;

    @FindBy(xpath = "//span[@class=\"ng-star-inserted\"]")
    public WebElement CarCheck;

    @FindBy(xpath ="//div[normalize-space()='Accessories']")
    public List<WebElement> MegaAccessories;

}
