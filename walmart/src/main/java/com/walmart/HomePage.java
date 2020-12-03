package com.walmart;

import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;


public class HomePage {
    @FindBy(id = "global-search-input")
    private WebElement searchBar;

    @FindBy(id = "on-scroll-sticky-header")
    private WebElement searchBtn;

    @FindBy(xpath = "(//div[text()='Sign In'])")
    private WebElement signInButton;

    @FindBy(partialLinkText = "create an account")
    private WebElement accountButton;

    @FindBy(id = "global-search-input")
    private WebElement SearchBar;

    @FindBy(id = "on-scroll-sticky-header")
    private WebElement cartButton;

    @FindBy(id = "global-search-dropdown-toggle")
    private WebElement allDepartmentsButton;

    @FindBy(id = "global-search-category-label")
    private WebElement clothingButton;

    @FindBy(id = "global-search-input")
    private WebElement searchMovies;

    @FindBy(id = "Search container")
    private WebElement giftFinderButton;

    @FindBy(id = "header-spart-menu")
    private WebElement pickupAnddeliveryButton;

    @FindBy(id = "header-bubble-menu")
    private WebElement reorderButton;


    @FindBy(id = "header-bubble-menu")
    private WebElement vedeoGamesButton;

    @FindBy(xpath = "(//a[text()='Electronics'])")
    private WebElement electronicsButton;

    @FindBy(xpath = "(//a[text()='Walmart for Business'])")
    private WebElement welmartForBusinessButton;

    @FindBy(xpath = "(//span[@class()= 'span-button-children'])")
    private WebElement viewOrderStatusButton;

    @FindBy(xpath = "(//span[text()= 'Sign In'])")
    private WebElement SignInButton;

    @FindBy(xpath = "(//button[text()='Sign in'])")
    private WebElement signInToYourWalmartAccount;

    @FindBy(id = "d7809192-4358-4b8a-b848-6dd084e6851d")
    private WebElement blackFridayDeals;

    @FindBy(id = "global-search-category-lebel")
    private WebElement dropDown;

    @FindBy(id = "global-search-input")
    private WebElement searchBarButton;


    @FindBy(id = "6071877f-2afe-40f0-944f-04322d986ed8-tileLink-1")
    private WebElement toycatalog;

    @FindBy(xpath = "(//a[text='Walmart Pay'])")
    private WebElement walmartPayButton;

    @FindBy(xpath = "(//a[text='Careers'])")
    private WebElement careersButton;

    @FindBy(xpath = "(//a[text='Tax Exempt Program'])")
    private WebElement taxExemptProgramButton;

    @FindBy(xpath = "(//a[text='MoneyCenter'])")
    private WebElement moneyCenterButton;

    @FindBy(xpath = "(//a[text='Contact Us'])")
    private WebElement contactUsButton;

    public void typeOnSearchBar() {
        searchBar.sendKeys("books");
    }

    public void clickOnSearchButton() {
        searchBtn.click();

    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public void clickOnAccountButton() {
        accountButton.click();
    }

    public void clickOnSearchBar() {
        searchBar.click();

    }

    public void clickOnCartButton() {
        cartButton.click();
    }

    public void clickOnAllDepartmentsButton() {
        allDepartmentsButton.click();
    }

    public void clickOnClothingButton() {
        clothingButton.click();
    }

    public void clickOnDropDownButton() {
        searchMovies.click();


    }

    public void clickOnGiftFinderButton() {
        giftFinderButton.click();
    }

    public void clickOnPickUpAndDelivery() {
        pickupAnddeliveryButton.click();
    }

    public void clickOnReorderButton() {
        reorderButton.click();
    }

    public void clickOnVideoGamesButton() {
        vedeoGamesButton.click();
    }

    public void clickOnElectronicsButton() {
        electronicsButton.click();
    }

    public void clickOnWalmartForBusinessButton() {
        welmartForBusinessButton.click();
    }

    public void clickOnViewOrderStatusButton() {
        viewOrderStatusButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickOnsignInToYourWalmartAccount() {
        signInToYourWalmartAccount.click();
    }

    public void clickOnBlackFridayDeals() {
        blackFridayDeals.click();
    }

    public void clickOnDropDown() {
        dropDown.click();
    }

    public void clickOnSearchBarButton() {
        searchBar.sendKeys("Jewelry");
    }

    public void clickOnToyCatalog() {
        toycatalog.click();
    }

    public void clickOnWalmartPayButton() {
        walmartPayButton.click();
    }

    public void clickOnCareersButton() {
        careersButton.click();
    }

    public void clickOnTaxExemptProgramButton() {
        taxExemptProgramButton.click();
    }

    public void clickOnMoneyCenterButton() {
        moneyCenterButton.click();
    }

    public void clickOnContactUsButton() {
        contactUsButton.click();
    }

}