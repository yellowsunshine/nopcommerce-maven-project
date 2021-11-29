package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends HomePage {

    By apparelMenu = By.partialLinkText("Apparel");

    public String getApparelPageText(){
        return doGetTextFromElement(apparelMenu);
    }
}
