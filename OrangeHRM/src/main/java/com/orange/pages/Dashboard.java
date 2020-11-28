package com.orange.pages;

import com.base.TestBase;
import com.reports.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class Dashboard extends TestBase {

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    private WebElement dashboardHeader;

    public void validateDashboardIsDisplayed() {
        SoftAssert sa = new SoftAssert();

        sa.assertTrue(dashboardHeader.isDisplayed());
        ExtentTestManager.log("Dashboard is displayed");

        String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String currentURL = driver.getCurrentUrl();
        sa.assertEquals(currentURL,expectedURL);
        ExtentTestManager.log("expected url loaded");

        sa.assertAll();

    }
}
