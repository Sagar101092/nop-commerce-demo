package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationSuccessfullMessage;


    public void clickOnLoginLink() {
        Reporter.log("click On LoginLink " + loginLink.toString() );
        CustomListeners.test.log(Status.PASS,"click On LoginLink " + loginLink );
        clickOnElement(loginLink);
    }

    public void clickOnLogOutLink() {
        Reporter.log("click On LogoutLink " + loginLink.toString() );
        CustomListeners.test.log(Status.PASS,"click On LogoutLink " + loginLink );
        clickOnElement(logOutLink);
    }

    public boolean loginLinkIsDisplayed() {
        Reporter.log("login Link Is Displayed " + loginLink.toString() );
        CustomListeners.test.log(Status.PASS,"login Link Is Displayed " + loginLink );
        return loginLink.isDisplayed();
    }

    /**
     * click On Register Tab
     */
    public void clickOnRegisterTab() {
        Reporter.log("click On Register Tab " + registerTab.toString());
        CustomListeners.test.log(Status.PASS, "click On Register Tab " + registerTab);
        clickOnElement(registerTab);
    }

    public String getRegistrationCompleteMessage() {
        Reporter.log("get Registration Complete Message " + registrationSuccessfullMessage.toString());
        CustomListeners.test.log(Status.PASS, "get Registration Complete Message " + registrationSuccessfullMessage);
        return getTextFromElement(registrationSuccessfullMessage);
    }

    public void selectAllMenu(String menuName) {
        Reporter.log("select All Menu " + registrationSuccessfullMessage.toString());
        CustomListeners.test.log(Status.PASS, "select All Menu " + registrationSuccessfullMessage);
        clickOnElement(By.xpath("//a[normalize-space()='" + menuName + "']"));
    }

}
