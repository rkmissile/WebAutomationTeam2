package com.orange.pages;

import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class LoginPage {

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
