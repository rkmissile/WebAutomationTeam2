package com.orangeTest;

import com.base.TestBase;
import com.orange.data.DataProviders;
import com.orange.pages.Dashboard;
import com.orange.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginValidation extends TestBase {

    /**
     *
     */
    @Test(enabled = false)
    public void validateLogin() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        Dashboard dashboard = PageFactory.initElements(driver,Dashboard.class);

        loginPage.loginToDashboard();
        dashboard.validateDashboardIsDisplayed();

    }



    @Test(dataProviderClass = DataProviders.class, dataProvider = "credentials", enabled = false)
    public void validateLoginWithWrongCredentials(String userName, String password) {

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickOnLoginButton();

        loginPage.validateLoginWarning();
    }

    @Test(enabled = false)
    public void testLoginWithWrongUserNRightPass(){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);

        loginPage.setUserName("Adminnn");//replace
        loginPage.setPassword("admin123");//replace
        loginPage.clickOnLoginButton();

        loginPage.validateLoginWarning();

    }


}
