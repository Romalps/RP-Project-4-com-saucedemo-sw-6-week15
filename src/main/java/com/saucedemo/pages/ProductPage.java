package com.saucedemo.pages;

import com.aventstack.extentreports.Status;
import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_item_label']")
    List<WebElement> totalItems;


    public String getProductText() {
        log.info("Get Product text : " + productText.toString());
        return getTextFromElement(productText);
    }
//    public void verifyTheTextProduct(String expectedText){
//
//
//    }

    public String getProductsPerPage() {

        int size = totalItems.size();
        log.info("Get product per page : " + totalItems.toString());
        return String.valueOf(size);
    }

    public void verifyThatSixProductsAreDisplayedOnPage(String expectedMessage) {
        Assert.assertEquals(getProductsPerPage(), expectedMessage);
        log.info("Verify six product are displayed: " + expectedMessage.toString());
    }


}
