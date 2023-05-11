package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customelisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement successfullyText;

    /**
     * select Processor
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectProcessor(String name) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Processor " + name + selectProcessor.toString());
        CustomListeners.test.log(Status.PASS,"select Processor " + name + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }

    /**
     * select Ram
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectRam(String name) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Ram " + name + selectProcessor.toString());
        CustomListeners.test.log(Status.PASS,"select Ram " + name + selectProcessor.toString());
        selectByVisibleTextFromDropDown(selectRam, name);
    }

    /**
     * select HDD
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectHDD(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select HDD " + value );
        CustomListeners.test.log(Status.PASS,"select HDD " + value );
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }

    /**
     * select Os
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectOs(String value) throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("select Os " + value );
        CustomListeners.test.log(Status.PASS,"select Os " + value );
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }

    public void selectSoftware(String value){
        Reporter.log("select software " + value );
        CustomListeners.test.log(Status.PASS,"select software " + value );
        selectCheckBox(By.xpath("(//label[contains(normalize-space(),'"+value+"')]//parent::*//input)[1]"));
    }

    public void clickOnAddtoCart() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("click on add to cart " + addToCart );
        CustomListeners.test.log(Status.PASS,"select software " + addToCart );
        clickOnElement(addToCart);
    }

    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("get Successfull Added To CartText " + successfullyText );
        CustomListeners.test.log(Status.PASS,"get Successfull Added To CartText " + successfullyText );
        return getTextFromElement(successfullyText);
    }
}
