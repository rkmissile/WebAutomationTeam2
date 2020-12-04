package com.walmarttest;

import com.base.TestBase;
import com.walmart.HomePage;
import com.walmart.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeAbleToTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToSearchForAnItem() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnAccountButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnAccountButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToWriteOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnCartButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCartButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnAllDepartmentsButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnAllDepartmentsButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnClothingButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnClothingButton();

    }

    @Test(enabled = false)
    public void validateProductDropDown() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeOnSearchBar();

    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnGiftFinderButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnGiftFinderButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnPickUpAndDeliveryButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnPickUpAndDelivery();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnReorderButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnReorderButton();

    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnVideoGamesButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnVideoGamesButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnElectronicsButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnElectronicsButton();

    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnWalmartForBusinessButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWalmartForBusinessButton();

    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnViewOrderStatusButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnViewOrderStatusButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnSignINButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnSignInToYourWalmartAccountButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnsignInToYourWalmartAccount();


    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnBlackFridayDealsButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnBlackFridayDeals();

    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnDropDownButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDropDownButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnSearchBarButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnToyCatalogButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnToyCatalog();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnWalmartPayButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnWalmartPayButton();

    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnCareersButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCareersButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnTaxExemptProgramButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnTaxExemptProgramButton();

    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnMoneyCenterButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMoneyCenterButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToClickOnContactUsButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnContactUsButton();
    }

    @Test(enabled = false)
    public void validateUserBeAbleToLogin() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnSignInButton();
        loginPage.typeOnEmailField();
        loginPage.typeOnPasswordField();
        loginPage.clickOnSignInButton();

    }
}