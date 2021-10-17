package com.hajper.step_definitions;

import com.hajper.pages.HomePage;
import com.hajper.utilities.BrowserUtils;
import com.hajper.utilities.ConfigurationReader;
import com.hajper.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class hajper_defs {

    HomePage homePage = new HomePage();

    @Given("Navigate to home page")
    public void navigateToHomepage() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForClickability(homePage.cookie,7);
        homePage.cookie.click();
    }

    @Then("Verify that user is on the home page")
    public void verifyThatUserIsOnTheHomePage() {
        String expectedUrl = "https://www.hajper.com/sv";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("Verify that the buttons in Regulation Header \\(as in image) are visible in the header")
    public void verifyThatTheButtonsInRegulationHeaderAsInImageAreVisibleInTheHeader() {
        //verify that spelpaus displayed
        Assert.assertTrue(homePage.spelpausBar.isDisplayed());
        //verify that spelgranser is displayed
        Assert.assertTrue(homePage.spelgranserBar.isDisplayed());
        //verify that sjalvtest is displayed
        Assert.assertTrue(homePage.sjalvtestBar.isDisplayed());
    }

    @Then("Verify that spel Inspektionen Logo is displayed")
    public void verifyThatSpelInspektionenLogoIsDisplayed() {
        //verify that spel Inspektionen Logo is displayed
        Assert.assertTrue(homePage.spelInspektionenLogo.isDisplayed());
    }
}
