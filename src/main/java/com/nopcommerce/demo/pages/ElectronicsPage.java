package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends HomePage {



    public String getElectronicsPageWelcomeText(){
        return doGetTextFromElement(electronicsMenu);
    }
}
