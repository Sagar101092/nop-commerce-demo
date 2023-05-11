package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailIDElement;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordElement;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;



    public String getWelcomeText() {
        Reporter.log("get Welcome Text " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS,"get Welcome Text " + welcomeText);
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String emailId){
        Reporter.log("enter EmailId " + emailIDElement.toString());
        CustomListeners.test.log(Status.PASS,"enter EmailId " + emailIDElement);
        sendTextToElement(emailIDElement,emailId);
    }

    public void enterPassword(String value){
        Reporter.log("enter Password " + passwordElement.toString());
        CustomListeners.test.log(Status.PASS,"enter Password " + passwordElement);
        sendTextToElement(passwordElement,value);
    }

    public void clickOnLoginButton(){
        Reporter.log("click On LoginButton " + loginButton.toString());
        CustomListeners.test.log(Status.PASS,"click On LoginButton " + loginButton);
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        Reporter.log("get ErrorMessage " + errorMessage.toString());
        CustomListeners.test.log(Status.PASS,"get ErrorMessage " + errorMessage);
        return getTextFromElement(errorMessage);
    }


}
