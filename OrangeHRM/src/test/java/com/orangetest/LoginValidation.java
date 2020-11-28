package com.orangetest;

import com.base.TestBase;
import com.orange.data.DataProviders;
import com.orange.pages.Dashboard;
import com.orange.pages.LoginPage;
import com.reports.ExtentTestManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginValidation extends TestBase {

    /**
     *
     */
    @Test(enabled = true)
    public void validateLogin() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        Dashboard dashboard = PageFactory.initElements(driver,Dashboard.class);

        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickOnLoginButton();

        dashboard.validateDashboardIsDisplayed();

    }



    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = true)
    public void testLoginWithWrongCredentials(String userName, String password) {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();

        loginPage.validateLoginWarning();
    }

    @Test(enabled = true)
    public void testLoginWithWrongUserNRightPass(){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);

        loginPage.setUserName("Adminnn");
        loginPage.setPassword("admin123");
        loginPage.clickOnLoginButton();

        loginPage.validateLoginWarning();

    }


}
