package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement desktop;

    public String getComputerText(){
        Reporter.log("get Computer Text " + computerText );
        CustomListeners.test.log(Status.PASS,"get Computer Text " + computerText );
        return getTextFromElement(computerText);
    }

    public void clickOnDesktop(){
        Reporter.log("click On Desktop " + desktop );
        CustomListeners.test.log(Status.PASS,"get Computer Text " + desktop );
        clickOnElement(desktop);
    }
}
