package com.orangetest;

import com.base.TestBase;
import com.orange.pages.LoginPage;
import com.orange.pages.MyInfo;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MyInfoValidations extends TestBase {

    @Test
    public void testURLOfMyInfo(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        MyInfo myInfo = PageFactory.initElements(driver, MyInfo.class);

        loginPage.loginToDashboard();
        clickOnElement("//b[contains(text(),'My Info')]");

        myInfo.validateURL();



    }




}
