package com.nopcommerce.demo.testsuites;

import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.UUID;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    String email;
    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        registerPage = new RegisterPage();
        homePage = new HomePage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        String exceptedMessage = "Register";
        homePage.clickOnRegisterTab();
        String actualMessage = registerPage.getRegisterText();
        Assert.assertEquals(exceptedMessage, actualMessage);
    }

    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandetory() throws InterruptedException {
        homePage.clickOnRegisterTab();
        registerPage.clickOnRegisterButton();

        String exceptedMessage = "First name is required.";
        String actualMessage = registerPage.getFirstNameRequiredMessage();
        Assert.assertEquals(exceptedMessage, actualMessage);

        exceptedMessage = "Last name is required.";
        actualMessage = registerPage.getLastNameRequiredMessage();
        Assert.assertEquals(exceptedMessage, actualMessage);

        exceptedMessage = "Email is required.";
        actualMessage = registerPage.getEmailRequiredMessage();
        Assert.assertEquals(exceptedMessage, actualMessage);

        exceptedMessage = "Password is required.";
        actualMessage = registerPage.getPasswordRequiredMessage();
        Assert.assertEquals(exceptedMessage, actualMessage);

        exceptedMessage = "Password is required.";
        actualMessage = registerPage.getConfirmPasswordRequiredMessage();
        Assert.assertEquals(exceptedMessage, actualMessage);
    }

    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        String name = UUID.randomUUID().toString();
        email = name + "@gmail.com";
        String exceptedMessage = "Your registration completed";
        homePage.clickOnRegisterTab();
        registerPage.enterFirstname("Prime");
        registerPage.enterLastname("Testing");
        registerPage.selectDay("10");
        registerPage.selectMonth("October");
        registerPage.selectYear("1992");
        registerPage.enterEmail(email);
        registerPage.enterPassword("Admin@123");
        registerPage.enterConfirmPassword("Admin@123");
        registerPage.clickOnRegisterButton();
        String acceptedMessage = homePage.getRegistrationCompleteMessage();
        Assert.assertEquals(exceptedMessage, acceptedMessage);
    }

}
