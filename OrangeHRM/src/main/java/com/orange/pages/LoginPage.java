package com.orange.pages;

import com.base.TestBase;
import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='txtUsername']")
    private WebElement userName;

    public void setUserName(String users) {
        userName.sendKeys(users);
    }

    @FindBy(xpath = "//input[@id='txtPassword']")
    private WebElement password;

    public void setPassword(String passwords) {
        password.sendKeys(passwords);
    }


    @FindBy(xpath = "//input[@id='btnLogin']")
    private WebElement loginButton;

    public void clickOnLoginButton() {

        loginButton.click();

    }

    public void loginToDashboard(){
        setUserName("Admin");
        setPassword("admin123");
        clickOnLoginButton();
    }


    public void navigateToPage(String URL){
        setUserName("Admin");
        setPassword("admin123");
        clickOnLoginButton();

        driver.get(URL);

    }


    @FindBy(xpath = "//span[@id='spanMessage']")
    private WebElement warningMessage;



    public void validateLoginWarning(){
        String warning = "Invalid credentials";
        String currentWarning = warningMessage.getText();

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(currentWarning,warning);
        ExtentTestManager.log(currentWarning);

        sa.assertAll(currentWarning + "is as expected");



    }


}
