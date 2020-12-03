package com.orange.pages;

import com.base.TestBase;
import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class MyInfo extends TestBase {

    public static String myInfoPageURL = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails";

    public void navigateToMyInfoPage() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);  // !?
        loginPage.navigateToPage(myInfoPageURL);
    }


    public void validateURL() {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails";
        String currentURL = driver.getCurrentUrl();

        sa.assertEquals(currentURL, expectedURL);
        ExtentTestManager.log("URl is as expected");

        sa.assertAll();

    }

    @FindBy(xpath = "//input[@id='personal_txtEmpFirstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='personal_txtEmpLastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='personal_optGender_1']")
    private WebElement genderMaleRadioBtn;

    @FindBy(xpath = "//input[@id='btnSave']")
    private WebElement editOrSaveBtnOfPersonalInfo;

    public void personalDetailsEditNSave() {
        SoftAssert softAssert = new SoftAssert();
        editOrSaveBtnOfPersonalInfo.click();
        firstName.clear();
        firstName.sendKeys("Russel");
        lastName.clear();
        lastName.sendKeys("Khan");
        genderMaleRadioBtn.click();
        ExtentTestManager.log("Gender updated to Male");

        editOrSaveBtnOfPersonalInfo.click();

        String firstNameValue = firstName.getAttribute("Value");
        ExtentTestManager.log("First name has been updated to " + firstNameValue);

        String lastNameValue = lastName.getAttribute("Value");
        ExtentTestManager.log("Last name has been updated to " + lastNameValue);

        softAssert.assertEquals(firstNameValue, "Russel");
        softAssert.assertEquals(lastNameValue, "Khan");

        softAssert.assertAll();

    }


}
