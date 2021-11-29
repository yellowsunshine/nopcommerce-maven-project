package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends HomePage {

    By computersMenu = By.partialLinkText("Computers");
    By desktopLink = By.xpath("//div[@class='block block-category-navigation']/descendant::a[2]");

    public String getComputersPageWelcomeText(){
        return doGetTextFromElement(computersMenu);
    }

    public void clickOnDesktopOptionOfComputerTab(){
        doClickOnElement(desktopLink);
    }

}
