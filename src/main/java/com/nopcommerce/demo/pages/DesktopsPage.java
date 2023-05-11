package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopText;

    public String getDesktopText(){
        return getTextFromElement(desktopText);
    }

    /**
     * click Add to Cart By ProductName
     * @param productName
     * @throws InterruptedException
     */
    public void clickAddByProductName(String productName) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select software " + productName );
        CustomListeners.test.log(Status.PASS,"select software " + productName );
        clickOnElement(By.xpath("(//h2//a[normalize-space()='"+productName+"']//following::button)[1]"));
    }

}
