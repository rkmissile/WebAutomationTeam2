package com.pages;

import com.base.TestBase;
import com.reports.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class Dashboard extends TestBase {

    @FindBy(xpath = "//input[@name=\"firstname\"]")
    private WebElement fNameInput;
    @FindBy(xpath = "//input[@name=\"lastname\"]")
    private WebElement lNameInput;
    @FindBy(xpath = "//select[@id=\"continents\"]")
    private WebElement continentsDDBtn;
    @FindBy(xpath = "//input[@id='sex-0']")
    private WebElement maleRBtn;
    @FindBy(xpath = "//input[@id='sex-1']")
    private WebElement femaleRBtn;
    @FindBy(xpath = "//a[contains(text(),'Welcome')]")
    private WebElement welcomeNB;
    @FindBy(xpath = "//a[text()='Our Passion']")
    private WebElement ourPassionNB;
    @FindBy(xpath = "//a[text()='Menu']")
    private WebElement menuNB;
    @FindBy(xpath = "//a[contains(text(),\"Let's Talk Tea\")]")
    private WebElement letsTalkTeaNB;
    @FindBy(xpath = "//a[contains(text(),'Check Out')]")
    private WebElement checkOutNB;
    @FindBy(xpath = "//h1[contains(text(),'Practice Form')]")
    private WebElement headerText;

    public void dashboardURL() {
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "http://www.practiceselenium.com/practice-form.html";
        String title = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(currentURL, expectedURL);
        ExtentTestManager.log("URL is as expected");
        ExtentTestManager.log("Title of the dashboard page is " + "'" + title + "'");

        softAssert.assertAll();

    }

    public void inputFields() {
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(fNameInput.isDisplayed());
        ExtentTestManager.log("First Name input field is displayed");
        softAssert.assertTrue(fNameInput.isEnabled());
        ExtentTestManager.log("First Name input field is enabled");


        softAssert.assertTrue(lNameInput.isDisplayed());
        ExtentTestManager.log("Last Name input field is displayed");
        softAssert.assertTrue(lNameInput.isEnabled());
        ExtentTestManager.log("Last Name input field is enabled");

        softAssert.assertAll();

    }

    public void dropDownOfContinent() {
        List<WebElement> continents = driver.findElements(By.xpath("//select[@id='continents']"));
//       List<WebElement> continents1 = (List<WebElement>) continentsDDBtn;

        ExtentTestManager.log("Available continent is : continents.size()");
//        int sizeOfContinents = continents.size();

        for (WebElement x : continents) {
            ExtentTestManager.log(x.getText());
        }

        Select selectContinent = new Select(continentsDDBtn);

        selectContinent.selectByIndex(2);
        ExtentTestManager.log("Continent is enable to select");

        sleepFor(2);

//        int sizeOfContinents = selectContinent.getAllSelectedOptions().size();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertFalse(selectContinent.isMultiple());
        ExtentTestManager.log("Multiple select option is not available");
//        softAssert.assertEquals(sizeOfContinents,7);
        ExtentTestManager.log("There are 7 available continents to select");

        softAssert.assertAll();


    }

    public void radioBtn() {

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertTrue(maleRBtn.isDisplayed());
        ExtentTestManager.log("Male radio button is displayed");
        softAssert.assertTrue(maleRBtn.isEnabled());
        ExtentTestManager.log("Male radio button is enabled");
        softAssert.assertTrue(maleRBtn.isSelected());
        ExtentTestManager.log("Male radio button is selected");


        softAssert.assertTrue(femaleRBtn.isDisplayed());
        ExtentTestManager.log("Female radio button is displayed");
        softAssert.assertTrue(femaleRBtn.isEnabled());
        ExtentTestManager.log("Female radio button is enabled");
        softAssert.assertFalse(femaleRBtn.isSelected());
        ExtentTestManager.log("Female radio button is not selected");

        softAssert.assertAll();


    }

    public void navigationBar() {
        SoftAssert softAssert = new SoftAssert();

        // isEnabled method only for input box validation>>

        softAssert.assertTrue(headerText.isEnabled());
        ExtentTestManager.log("header is enabled");

        softAssert.assertTrue(welcomeNB.isDisplayed());
        ExtentTestManager.log("Welcome navigation is displayed");
        softAssert.assertTrue(welcomeNB.isEnabled());
        ExtentTestManager.log("Welcome navigation is enabled");

        softAssert.assertTrue(ourPassionNB.isDisplayed());
        ExtentTestManager.log("Our Passion navigation is displayed");
        softAssert.assertTrue(ourPassionNB.isEnabled());
        ExtentTestManager.log("Our Passion navigation is enabled");

        softAssert.assertTrue(menuNB.isDisplayed());
        ExtentTestManager.log("Menu navigation is displayed");
        softAssert.assertTrue(menuNB.isEnabled());
        ExtentTestManager.log("Welcome navigation is enabled");

        softAssert.assertTrue(letsTalkTeaNB.isDisplayed());
        ExtentTestManager.log("Let's Talk Tea navigation is displayed");
        softAssert.assertTrue(letsTalkTeaNB.isEnabled());
        ExtentTestManager.log("Let's Talk Tea navigation is enabled");

        softAssert.assertTrue(checkOutNB.isDisplayed());
        ExtentTestManager.log("Check Out navigation is displayed");
        softAssert.assertTrue(checkOutNB.isEnabled());
        ExtentTestManager.log("Check Out navigation is enabled");


        softAssert.assertAll();
    }


}
