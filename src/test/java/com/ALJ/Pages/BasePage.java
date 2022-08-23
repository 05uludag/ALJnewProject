package com.ALJ.Pages;

import com.ALJ.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage { public BasePage() {
    PageFactory.initElements(Driver.get(), this);
}

}
