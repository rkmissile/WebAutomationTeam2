package com.passionTest;

import com.base.TestBase;
import com.pages.Dashboard;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DashboardValidations extends TestBase {


    @Test(enabled = false)
    public void validateDashboardURL() {
        Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

        dashboard.dashboardURL();
    }

    @Test(enabled = false)
    public void validateInputFields() {
        Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

        dashboard.inputFields();
    }

    @Test(enabled = false)
    public void validateDropDownOfContinent() {
        Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

        dashboard.dropDownOfContinent();

    }

    @Test(enabled = false)
    public void validateRadioBtn() {
        Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

        dashboard.radioBtn();


    }

    @Test
    public void validateNavigationBar() {
        Dashboard dashboard = PageFactory.initElements(driver, Dashboard.class);

        dashboard.navigationBar();

    }

}
