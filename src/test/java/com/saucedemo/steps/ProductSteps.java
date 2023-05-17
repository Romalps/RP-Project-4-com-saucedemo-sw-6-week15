package com.saucedemo.steps;

import com.saucedemo.pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class ProductSteps {
    @Then("^verify that \"([^\"]*)\" products are displayed on page$")
    public void verifyThatProductsAreDisplayedOnPage(String expectedMessage)  {
        new ProductPage().verifyThatSixProductsAreDisplayedOnPage(expectedMessage);
    }
}
