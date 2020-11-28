package com.walmart;

import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "Sign in-submit-bnt")
    private WebElement signInButton;

    public void typeOnEmailField() {
        emailField.sendKeys("a2020@gmail.com");

    }

    public void typeOnPasswordField() {
        passwordField.sendKeys("696969@!");
    }

    public void clickOnSignInButton() {
        signInButton.click();
        ExtentTestManager.log("Click Sign in button");

    }
}