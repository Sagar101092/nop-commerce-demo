package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmpassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompleted;
    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameRequiredMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailRequiredMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordRequired;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordRequired;

    /**
     * enter Firstname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Firstname " + firstName.toString());
        CustomListeners.test.log(Status.PASS, "enter Firstname " + firstName);
        sendTextToElement(firstName, value);
    }

    /**
     * enter Lastname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Lastname " + lastName.toString());
        CustomListeners.test.log(Status.PASS, "enter Lastname " + lastName);
        sendTextToElement(lastName, value);
    }

    public void selectDay(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Select Day " + day.toString());
        CustomListeners.test.log(Status.PASS, "Select Day  " + day);
        selectByVisibleTextFromDropDown(day, value);
    }

    public void selectMonth(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Select month " + month.toString());
        CustomListeners.test.log(Status.PASS, "Select month  " + month);
        selectByVisibleTextFromDropDown(month, value);
    }

    public void selectYear(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Select Year " + year.toString());
        CustomListeners.test.log(Status.PASS, "Select Year  " + year);
        selectByVisibleTextFromDropDown(year, value);
    }



    /**
     * enter Email
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Email " + email.toString());
        CustomListeners.test.log(Status.PASS, "enter Email " + email);
        sendTextToElement(email, value);
    }

    /**
     * enter Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Password " + password.toString());
        CustomListeners.test.log(Status.PASS, "enter Password " + password);
        sendTextToElement(password, value);
    }

    /**
     * enter Confirm Password
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterConfirmPassword(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("enter Confirm Password " + confirmpassword.toString());
        CustomListeners.test.log(Status.PASS, "enter Confirm Password " + confirmpassword);
        sendTextToElement(confirmpassword, value);
    }

    /**
     * click On Register Button
     *
     * @throws InterruptedException
     */
    public void clickOnRegisterButton() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click On Register Button " + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "click On Register Button " + registerButton);
        clickOnElement(registerButton);
    }

    /**
     * get Registration Completed Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getRegistrationCompletedText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Registration Completed Text " + registrationCompleted.toString());
        CustomListeners.test.log(Status.PASS, "get Registration Completed Text " + registrationCompleted);
        return getTextFromElement(registrationCompleted);
    }

    public String getRegisterText() {
        Reporter.log("get Register Text " + registerText.toString());
        CustomListeners.test.log(Status.PASS, "get Registration Completed Text " + registerText);
        return getTextFromElement(registerText);
    }

    public String getFirstNameRequiredMessage() {
        Reporter.log("get First Name RequiredMessage " + firstNameRequiredMessage.toString());
        CustomListeners.test.log(Status.PASS, "get First Name RequiredMessage " + firstNameRequiredMessage);
        return getTextFromElement(firstNameRequiredMessage);
    }

    public String getLastNameRequiredMessage() {
        Reporter.log("get Last Name RequiredMessage " + lastNameRequiredMessage.toString());
        CustomListeners.test.log(Status.PASS, "get Last Name RequiredMessage " + lastNameRequiredMessage);
        return getTextFromElement(lastNameRequiredMessage);
    }

    public String getEmailRequiredMessage() {
        Reporter.log("get Email RequiredMessage " + emailRequiredMessage.toString());
        CustomListeners.test.log(Status.PASS, "get Email RequiredMessage " + emailRequiredMessage);
        return getTextFromElement(emailRequiredMessage);
    }

    public String getPasswordRequiredMessage() {
        Reporter.log("get password RequiredMessage " + passwordRequired.toString());
        CustomListeners.test.log(Status.PASS, "get password RequiredMessage " + passwordRequired);
        return getTextFromElement(passwordRequired);
    }

    public String getConfirmPasswordRequiredMessage() {
        Reporter.log("get confirm password RequiredMessage " + confirmPasswordRequired.toString());
        CustomListeners.test.log(Status.PASS, "get confirm password RequiredMessage " + confirmPasswordRequired);
        return getTextFromElement(confirmPasswordRequired);
    }

}
