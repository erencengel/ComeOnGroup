package com.hajper.pages;

import com.hajper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "button.btn.btn--ghost")
    public WebElement cookie;

    @FindBy(css = ".regulations-header-sga__RegulationsIcon-pgu2pb-1.regulations-header-sga__RegulationsIconPause-pgu2pb-2.hniHCa.jRgbOb")
    public WebElement spelpausBar;

    @FindBy(css = ".regulations-header-sga__RegulationsIcon-pgu2pb-1.regulations-header-sga__RegulationsIconLimits-pgu2pb-3.hniHCa.cJihza")
    public WebElement spelgranserBar;

    @FindBy(css = ".regulations-header-sga__RegulationsIcon-pgu2pb-1.regulations-header-sga__RegulationsIconTest-pgu2pb-4.hniHCa.eTRgkl")
    public WebElement sjalvtestBar;

    @FindBy(css = ".licenses-logos__spelinspektionen.u-dib")
    public WebElement spelInspektionenLogo;

}
