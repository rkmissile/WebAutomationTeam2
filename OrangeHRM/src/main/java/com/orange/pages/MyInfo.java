package com.orange.pages;

import com.base.TestBase;
import com.reports.ExtentTestManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class MyInfo extends TestBase {


    public void validateURL() {

        SoftAssert sa = new SoftAssert();

        String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails";
        String currentURL = driver.getCurrentUrl();

        sa.assertEquals(currentURL,expectedURL);
        ExtentTestManager.log("URl is as expected");

        sa.assertAll();




    }


}
