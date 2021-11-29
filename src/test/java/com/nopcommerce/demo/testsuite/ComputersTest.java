package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {

    /**
     * Create the package name computer
     * 1. Create class “TestSuite”
     * <p>
     * Write the following Test:
     * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
     * 1.1 Click on Computer Menu.
     * 1.2 Click on Desktop
     * 1.3 Select Sort By position "Name: Z to A"
     * 1.4 Verify the Product will arrange in Descending order.
     * <p>
     * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
     * 2.1 Click on Computer Menu.
     * 2.2 Click on Desktop
     * 2.3 Select Sort By position "Name: A to Z"
     * 2.4 Click on "Add To Cart"
     * 2.5 Verify the Text "Build your own computer"
     * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
     * 2.7.Select "8GB [+$60.00]" using Select class.
     * 2.8 Select HDD radio "400 GB [+$100.00]"
     * 2.9 Select OS radio "Vista Premium [+$60.00]"
     * A          2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
     * 2.11 Verify the price "$1,475.00"
     * 2.12 Click on "ADD TO CARD" Button.
     * 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
     * After that close the bar clicking on the cross button.
     * 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
     * 2.15 Verify the message "Shopping cart"
     * 2.16 Change the Qty to "2" and Click on "Update shopping cart"
     * 2.17 Verify the Total"$2,950.00"
     * 2.18 click on checkbox “I agree with the terms of service”
     * 2.19 Click on “CHECKOUT”
     * 2.20 Verify the Text “Welcome, Please Sign In!”
     * 2.21Click on “CHECKOUT AS GUEST” Tab
     * 2.22 Fill the all mandatory field
     * 2.23 Click on “CONTINUE”
     * 2.24 Click on Radio Button “Next Day Air($0.00)”
     * 2.25 Click on “CONTINUE”
     * 2.26 Select Radio Button “Credit Card”
     * 2.27 Select “Master card” From Select credit card dropdown
     * 2.28 Fill all the details
     * 2.29 Click on “CONTINUE”
     * 2.30 Verify “Payment Method” is “Credit Card”
     * 2.32 Verify “Shipping Method” is “Next Day Air”
     * 2.33 Verify Total is “$2,950.00”
     * 2.34 Click on “CONFIRM”
     * 2.35 Verify the Text “Thank You”
     * 2.36 Verify the message “Your order has been successfully processed!”
     * 2.37 Click on “CONTINUE”
     * 2.37 Verify the text “Welcome to our store”
     */

    HomePage homePage = new HomePage();
    ElectronicsCellPhonesPage electronicsCellPhonesPage = new ElectronicsCellPhonesPage();
    CellPhonesListViewPage cellPhonesListViewPage = new CellPhonesListViewPage();
    CellPhonesListViewNokiaLumiaPage cellPhonesListViewNokiaLumiaPage = new CellPhonesListViewNokiaLumiaPage();
    CellPhonesListViewNokiaLumiaShoppingCartPage shoppingCartPage = new CellPhonesListViewNokiaLumiaShoppingCartPage();
    SignInPage signInPage = new SignInPage();
    RegistrationPage register = new RegistrationPage();
    RegistrationCompletePage registrationComplete = new RegistrationCompletePage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ShippingOptionCheckoutPage shippingOption = new ShippingOptionCheckoutPage();
    PaymentMethodPage paymentMethod = new PaymentMethodPage();
    PaymentInfoPage paymentInfo = new PaymentInfoPage();
    ConfirmOrderPage confirmOrder = new ConfirmOrderPage();
    CheckoutCompletedPage checkoutComplete = new CheckoutCompletedPage();
    WelcomeToOurStorePage welcomePage = new WelcomeToOurStorePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    @Test
    public void testComputersPage() throws InterruptedException {

        homePage.clickOnComputerMenu();
        computersPage.clickOnDesktopOptionOfComputerTab();
        desktopPage.selectSortByZToAFromDropDownMenu("Name: Z to A");
        desktopPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {
        testComputersPage();

        desktopPage.clickOnAddToCartForBuildYourOwnComputer();

        buildYourOwnComputerPage.verifyTheBuildYourOwnComputerMessage();
        buildYourOwnComputerPage.selectGhzIntelPentiumDualCore("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(3000);
        buildYourOwnComputerPage.selectRamAs8Gb(3);
        Thread.sleep(3000);
        buildYourOwnComputerPage.selectHDDRadio();
        Thread.sleep(3000);
        buildYourOwnComputerPage.selectOSRadioButton();
        Thread.sleep(3000);
        buildYourOwnComputerPage.clickOnTotalCommander();
        //buildYourOwnComputerPage.waitForElementToBeVisible(40);
        Thread.sleep(5000);
        buildYourOwnComputerPage.verifyTotalAmount();
        buildYourOwnComputerPage.clickOnAddToCartButton();
        buildYourOwnComputerPage.verifyProductHasBeenAddedToYourShoppingCartMessage();
        buildYourOwnComputerPage.closeTheBarByClickingOnCrossButton();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCartButton();

        shoppingCart.verifyTheShoppingCartDisplayMessage();
        shoppingCart.clearTheQuantityField();
        shoppingCart.updateTheQuantityField("2");
        shoppingCart.clickOnUpdateShoppingCart();
        shoppingCart.verifyTotalAmount("$2,950.00");
        shoppingCart.agreeWithTermsAndConditions();
        shoppingCart.clickOnCheckoutButton();

        signInPage.verifyTheSignInDisplayMessage();
        signInPage.clickOnCheckOutAsAGuestTab();

        checkoutPage.enterNameInTheFirstNameField("George");
        checkoutPage.enterLastNameInTheLastNameField("Smith");
        checkoutPage.enterRandomEmailInTheEmailField();
        checkoutPage.selectDataFromCountryDropDown(3);
        checkoutPage.enterDataInTheCityField("London");
        checkoutPage.enterDataInTheAddress1Field("123 Abc Avenue");
        checkoutPage.enterDataInTheZipPostalCodeField("AB12CD");
        checkoutPage.enterDataInTheMobileNumberField("07912312312");
        checkoutPage.clickOnContinueButton();

        shippingOption.clickOnNextDayAirButton();
        shippingOption.clickOnContinueButton();

        paymentMethod.clickOnCreditCardRadioButton();
        paymentMethod.clickOnContinueButton();

        paymentInfo.selectCreditCardType(1);
        paymentInfo.inputCardHoldersName("John Smith");
        paymentInfo.inputCardNumber("4700 1234 5678 7840");
        paymentInfo.inputExpireMonth("10");
        paymentInfo.inputExpireYear("2030");
        paymentInfo.inputCardCode("999");
        paymentInfo.clickOnContinueButton();

        Thread.sleep(4000);
        confirmOrder.verifyPaymentMethodOption("Credit Card");
        Thread.sleep(4000);
        confirmOrder.verifyShippingMethodOption("Next Day Air");
        Thread.sleep(4000);
        confirmOrder.verifyTotalAmountComputersField("$2,950.00");
        Thread.sleep(4000);
        confirmOrder.clickOnConfirmButton();

        checkoutComplete.verifyThankYouMessage();
        checkoutComplete.verifyOrderProcessedSuccessfullyMessage();
        checkoutComplete.clickOnContinueButton();

        welcomePage.verifyTheWelcomeToStoreDisplayMessage();
















    }


}
