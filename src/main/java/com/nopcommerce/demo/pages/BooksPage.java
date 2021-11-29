package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends HomePage {

    By booksMenu = By.partialLinkText("Books");

    public String getBookPageWelcomeText(){
        return doGetTextFromElement(booksMenu);
    }
}
