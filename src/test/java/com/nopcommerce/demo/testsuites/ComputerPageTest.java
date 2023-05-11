package com.nopcommerce.demo.testsuites;

import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {


    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod()
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.selectAllMenu("Computers");
        String expectedMessage = "Computers";
        String actualMessage = computerPage.getComputerText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.selectAllMenu("Computers");
        computerPage.clickOnDesktop();
        String expectedMessage = "Desktops";
        String actualMessage = desktopsPage.getDesktopText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test(dataProvider = "buildcomputer", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        homePage.selectAllMenu("Computers");
        computerPage.clickOnDesktop();
        desktopsPage.clickAddByProductName("Build your own computer");
        buildYourOwnComputerPage.selectProcessor(processor);
        buildYourOwnComputerPage.selectRam(ram);
        buildYourOwnComputerPage.selectHDD(hdd);
        buildYourOwnComputerPage.selectOs(os);
        buildYourOwnComputerPage.selectSoftware(software);
        buildYourOwnComputerPage.clickOnAddtoCart();
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildYourOwnComputerPage.getSuccessfullAddedToCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Not added in cart");

    }
}
