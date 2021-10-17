package com.hajper.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    static WebDriverWait webDriverWait;

    public static WebElement waitForClickability(WebElement element, int time){
        webDriverWait = new WebDriverWait(Driver.get(),time);
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
