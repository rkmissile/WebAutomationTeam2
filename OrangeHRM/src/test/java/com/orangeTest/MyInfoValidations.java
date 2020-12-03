package com.orangeTest;

import com.base.TestBase;
import com.orange.pages.MyInfo;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyInfoValidations extends TestBase {

    @BeforeMethod
    public void navigateToMyInfoPage(){
        MyInfo myInfo = PageFactory.initElements(driver,MyInfo.class);
        myInfo.navigateToMyInfoPage();
    }

    @Test(enabled = false)
    public void validateURLOfMyInfoPage(){
        MyInfo myInfo = PageFactory.initElements(driver, MyInfo.class);
        myInfo.validateURL();
    }

    @Test(enabled = false,groups = "regression")
    public void validatePersonalDetailsEditNSave() {
        MyInfo myInfo = PageFactory.initElements(driver, MyInfo.class);
        myInfo.personalDetailsEditNSave();
    }




}
